package in.ua.denoming.juja.labs.lab36;

import java.math.BigInteger;
import java.util.Arrays;

public class PolyUtils {
    public static BigInteger[] multiply(BigInteger[] x, BigInteger[] y) {
        BigInteger[] output = new BigInteger[x.length + y.length - 1];
        Arrays.fill(output, BigInteger.ZERO);

        for (int i = x.length - 1; i >= 0; --i) {
            for (int j = y.length - 1; j >= 0; --j) {
                output[i + j] = output[i + j].add(x[i].multiply(y[j]));
            }
        }

        return output;
    }
}
