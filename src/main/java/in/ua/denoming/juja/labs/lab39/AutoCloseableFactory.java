package in.ua.denoming.juja.labs.lab39;

public interface AutoCloseableFactory {
    AutoCloseable create() throws Throwable;
}
