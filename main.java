import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            List<Person> persons = new ArrayList<>();
            persons.add(new Student("Luke", 20, "S001"));
            persons.add(new Student("Anakin", 22, "S002"));
            persons.add(new Student("Han", 19, "S003"));
            persons.add(new Teacher("Dr Dooku", 45, "Fencing"));
            persons.add(new Teacher("Prof Yoda", 50, "Philosophy"));

            PersonStorage.save(persons, "persons.dat");

            List<Person> loadedPersons = PersonStorage.load("persons.dat");

            for (Person p : loadedPersons) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
