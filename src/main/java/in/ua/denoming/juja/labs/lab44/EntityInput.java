package in.ua.denoming.juja.labs.lab44;

import java.io.IOException;

public interface EntityInput {
    Person readPerson() throws IOException;
    Point readPoint() throws IOException;
}
