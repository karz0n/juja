package in.ua.denoming.juja.labs.lab43;

import java.io.*;

@SuppressWarnings("WeakerAccess")
public class EntityOutputStream implements EntityOutput {
    private final DataOutput output;

    public EntityOutputStream(OutputStream os) {
        output = new DataOutputStream(os);
    }

    @Override
    public void writePerson(Person person) throws IOException {
        output.writeInt(person.getAge());
        if (person.getName() == null) {
            output.writeBoolean(false);
        } else {
            output.writeBoolean(true);
            output.writeUTF(person.getName());
        }
    }

    @Override
    public void writePoint(Point point) throws IOException {
        int value = (point.getX() << 4) | point.getY();
        output.writeByte(value);
    }
}
