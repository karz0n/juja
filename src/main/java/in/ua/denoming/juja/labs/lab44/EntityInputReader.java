package in.ua.denoming.juja.labs.lab44;

import java.io.*;
import java.util.*;
import java.util.regex.*;

@SuppressWarnings("WeakerAccess")
public class EntityInputReader implements EntityInput {
    private BufferedReader reader;

    public EntityInputReader(Reader reader) {
        this.reader = new BufferedReader(reader);
    }

    @Override
    public Person readPerson() throws IOException {
        reader.readLine();
        String ageLine = reader.readLine();
        String nameLine = reader.readLine();
        reader.readLine();

        int age;
        Pattern ra = Pattern.compile("<age>(\\d+)</age>");
        Matcher ma = ra.matcher(ageLine);
        if (ma.find()) {
            String value = ma.group(1);
            Objects.requireNonNull(value);
            age = Integer.valueOf(value);
        } else {
            throw new RuntimeException("Incorrect format");
        }

        String name;
        Pattern rn = Pattern.compile("<name>(\\S+)</name>");
        Matcher mn = rn.matcher(nameLine);
        if (mn.find()) {
            name = mn.group(1);
            Objects.requireNonNull(name);
        } else {
            throw new RuntimeException("Incorrect format");
        }

        return new Person(name, age);
    }

    @Override
    public Point readPoint() throws IOException {
        String line = reader.readLine();

        int x, y;
        Pattern r = Pattern.compile("<point x=(\\d+) y=(\\d+)></point>");
        Matcher m = r.matcher(line);
        if (m.find()) {
            String xStr = m.group(1);
            Objects.requireNonNull(xStr);
            x = Integer.valueOf(xStr);

            String yStr = m.group(2);
            Objects.requireNonNull(yStr);
            y = Integer.valueOf(yStr);
        } else {
            throw new RuntimeException("Incorrect format");
        }

        return new Point(x, y);
    }
}
