import java.io.*;
import java.util.List;

public class PersonStorage {

    public static void save(List<Person> persons, String fileName) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(persons);
        out.close();
        // implements -> interface Closeable
        try (out) {
            out.writeObject(persons);
        }
    }

    public static List<Person> load(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
        List<Person> persons = (List<Person>) in.readObject();
        in.close();
        return persons;
    }
}
