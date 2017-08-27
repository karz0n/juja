package in.ua.denoming.juja.labs.lab37;

public class StringUtils {
    public static String rightShift(String str, int delta) {
        if (str.length() == 0) {
            return "";
        }

        delta = delta % str.length();
        if (delta != 0) {
            char[] chars = str.toCharArray();

            if (delta > 0) {
                for (int i = 0; i < delta; i++) {
                    char endChar = chars[chars.length - 1];
                    System.arraycopy(chars, 0, chars, 1, chars.length - 1);
                    chars[0] = endChar;
                }
            } else {
                delta = Math.abs(delta);
                for (int i = 0; i < delta; i++) {
                    char firstChar = chars[0];
                    System.arraycopy(chars, 1, chars, 0, chars.length - 1);
                    chars[chars.length - 1] = firstChar;
                }
            }

            str = new String(chars);
        }
        return str;
    }
}
