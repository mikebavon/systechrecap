package systech.academy.school;

public class Student {

    private Student(){}

    private static Student student;

    public static Student getInstance(){
        if (student == null)
            student = new Student();

        return student;
    }

    private String name;

    private String regNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }
}
