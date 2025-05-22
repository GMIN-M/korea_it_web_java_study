package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student() ;
        student.name = "권규민";
        student.age = 29;
        student.email = "zpxxxx";
        student.adress = "부산";

        student.showInfo();
    }
}
