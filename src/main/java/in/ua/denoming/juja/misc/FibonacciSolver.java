package in.ua.denoming.juja.misc;

class FibonacciSolver {
    static private long[] cache = new long[100000];
    static long calc(int n) {
        if (n <= 0) {
            return 0;
        }

        if (n <= 2) {
            cache[n] = 1;
            return 1;
        }

        for (int index = 3; index <= n; index++) {
            if (cache[index] == 0) {
                cache[index] = calc(index - 1) + calc(index - 2);
            }
        }

        return cache[n];
    }
}
