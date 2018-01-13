package in.ua.denoming.juja.labs.lab43;

import java.io.IOException;

public interface EntityOutput {
    void writePerson(Person person) throws IOException;
    void writePoint(Point point) throws IOException;
}
