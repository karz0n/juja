package in.ua.denoming.juja.misc;

class FactorialSolver {
    static long calc(int n) {
        if (n == 0) return 1;
        if (n == 1) return 1;
        if (n == 2) return 1;
        return calc(n - 1) + calc(n - 2);
    }
}
