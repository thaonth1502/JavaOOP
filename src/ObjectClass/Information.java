package ObjectClass;

public class Information {
    public static void main(String[] args) {

        Student student = new Student();
        student.getInfo();
        System.out.println(student.getAge());
        System.out.println(Student.getAge());
    }
}
