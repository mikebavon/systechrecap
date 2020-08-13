package systech.academy.school;

public class StudentMain {

    public static void main(String args []){

        Student student1 = Student.getInstance();
        student1.setName("Mike Bavon");
        student1.setRegNo("2323233");

        Student student2 = Student.getInstance();

        System.out.println("student2....");
        System.out.println(student2.getName());
        System.out.println(student2.getRegNo());

        student2.setName("Yonathaniel kilei");

        System.out.println();
        System.out.println();
        System.out.println("student1....");
        System.out.println(student1.getName());
        System.out.println(student1.getRegNo());

        System.out.println(student2.getName());
    }
}
