public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{name='" + getName() + "', age=" + getAge() + ", studentId='" + studentId + "'}";
    }
}
