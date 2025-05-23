package _21_Class.Student;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("부산","zpxxxx",29,"권규민") ;
        student.setName("홍길동");
//        student.name = "권규민";
//        student.age = 29;
//        student.email = "zpxxxx";
//        student.address = "부산";
        System.out.println(student.getEmail());
        student.showInfo();
    }
}
