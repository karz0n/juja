package in.ua.denoming.juja.labs.lab43;

import java.io.*;

@SuppressWarnings("WeakerAccess")
public class EntityInputStream implements EntityInput {
    private DataInput input;

    public EntityInputStream(InputStream is) {
        input = new DataInputStream(is);
    }

    @Override
    public Person readPerson() throws IOException {
        int age = input.readInt();

        String name = "";
        boolean hasName = input.readBoolean();
        if (hasName) {
            name = input.readUTF();
        }

        return new Person(name, age);
    }

    @Override
    public Point readPoint() throws IOException {
        int value = input.readByte();
        return new Point(value >>> 4, value & 0x0F);
    }
}
