package ObjectClass;

public class Student {

    String name;
    static int age;
    String phone = "0356099019";

    //Constructor Khong tham so
    public Student(){

    }

    //Constructor CO tham so
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public static int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }

    public static void main(String[] args) {
        Student student = new Student("Nguyen Huong Thao", 35);
        student.getInfo();
//        student.getName();

    }
}
