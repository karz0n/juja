package in.ua.denoming.juja.labs.lab45;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFilter {
    public static void filter(InputStream is, OutputStream os, int bufferSize, byte filterCriteria) throws IOException {
        byte[] buffer = new byte[bufferSize];

        int count;
        while ((count = is.read(buffer)) != -1) {
            int c = 0;
            int offset = 0;
            while (count > c) {
                byte b = buffer[c];
                if (b == filterCriteria) {
                    int length = c - offset;
                    if (length > 0) {
                        os.write(buffer, offset, c - offset);
                    }
                    offset = ++c;
                    continue;
                }
                c++;
            }

            int length = c - offset;
            if (length > 0) {
                os.write(buffer, offset, c - offset);
            }
        }
    }
}
