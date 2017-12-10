package in.ua.denoming.juja.labs.lab39;

import java.util.Stack;

public class TryWithResource {
    public static void twoResource(AutoCloseableFactory factoryA, AutoCloseableFactory factoryB, TryBody body) throws Throwable {
        manyResources(body, factoryA, factoryB);
    }

    private static void manyResources(TryBody body, AutoCloseableFactory... factories) throws Throwable {
        Stack<AutoCloseable> resources = new Stack<>();

        Throwable e = null;
        try {
            for (AutoCloseableFactory factory : factories) {
                resources.push(factory.create());
            }
        } catch (Throwable throwable) {
            e = throwable;
            while (resources.size() > 0) {
                AutoCloseable resource = resources.pop();
                try {
                    resource.close();
                } catch (Throwable inner) {
                    e.addSuppressed(inner);
                }
            }
            throw e;
        }

        try {
            body.runBody();
        } catch (Throwable throwable) {
            e = throwable;
            while (resources.size() > 0) {
                AutoCloseable resource = resources.pop();
                try {
                    resource.close();
                } catch (Throwable inner) {
                    e.addSuppressed(inner);
                }
            }
            throw e;
        }

        while (resources.size() > 0) {
            AutoCloseable resource = resources.pop();
            try {
                resource.close();
            } catch (Throwable inner) {
                if (e == null) {
                    e = inner;
                    continue;
                }
                e.addSuppressed(inner);
            }
        }

        if (e != null) {
            throw e;
        }
    }
}
