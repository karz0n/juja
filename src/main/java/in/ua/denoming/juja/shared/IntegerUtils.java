package in.ua.denoming.juja.shared;

class IntegerUtils {
    static int leftShift(int value) {
        return (value << 1) | (value >>> Integer.SIZE - 1);
    }

    static int rightShift(int arg) {
        return (arg >>> 1) | (arg << Integer.SIZE - 1);
    }

    static byte swapBits(byte b, int i, int j) {
        byte b1 = (byte)((b >>> i) & 1);
        byte b2 = (byte)((b >>> j) & 1);

        if (b1 == b2) {
            return b;
        }

        int mask = ((1 << i) | (1 << j));

        return (byte)(b ^ mask);
    }
}
