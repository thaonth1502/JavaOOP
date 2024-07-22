package TinhKeThua;

public class Student extends Person{

    public Student(String name, int age, float height) {
        super(name, age, height);
    }

    public static void main(String[] args) {
        Student student = new Student("Thao", 35, 158);
        student.getInfo();
    }
}
