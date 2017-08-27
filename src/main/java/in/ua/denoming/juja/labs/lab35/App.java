package in.ua.denoming.juja.labs.lab35;

import java.math.BigInteger;
import java.util.Arrays;

class PolyUtils {
    static BigInteger eval(BigInteger[] polynomial, BigInteger arg) {
        BigInteger output = BigInteger.ZERO;
        for (int i = polynomial.length - 1; i >= 0 ; --i) {
            if (polynomial[i].compareTo(BigInteger.ZERO) != 0) {
                output = output.add(arg.pow(polynomial.length - i - 1).multiply(polynomial[i]));
            }
        }
        return output;
    }

    static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
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

public class App {
    public static void main(String[] args) {
        BigInteger[] polynomial = {
            BigInteger.valueOf(10),
            BigInteger.valueOf(0),
            BigInteger.valueOf(-100)
        };
        BigInteger output1 = PolyUtils.eval(polynomial, BigInteger.valueOf(100));
        System.out.println(output1);

        BigInteger[] x = {
            BigInteger.valueOf(10),
            BigInteger.valueOf(0),
            BigInteger.valueOf(1)
        };

        BigInteger[] y = {
            BigInteger.valueOf(-1),
            BigInteger.valueOf(1)
        };

        BigInteger[] output2 = PolyUtils.mul(x, y);
        System.out.println(Arrays.toString(output2));
    }
}
