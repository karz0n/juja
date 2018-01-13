package in.ua.denoming.juja.labs.lab44;

import java.io.*;

@SuppressWarnings("WeakerAccess")
public class EntityOutputWriter implements EntityOutput {
    private Writer writer;

    public EntityOutputWriter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void writePerson(Person person) throws IOException {
        int age = person.getAge();
        String name = person.getName();
        writer.write("<person>" + System.lineSeparator());
        writer.write("    <age>" + age + "</age>" + System.lineSeparator());
        writer.write("    <name>" + name + "</name>" + System.lineSeparator());
        writer.write("</person>" + System.lineSeparator());
        writer.flush();
    }

    @Override
    public void writePoint(Point point) throws IOException {
        writer.write("<point x=" + point.getX() + " y=" + point.getY() + "></point>n" + System.lineSeparator());
        writer.flush();
    }
}
