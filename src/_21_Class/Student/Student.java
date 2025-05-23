package _21_Class.Student;

public class Student {
    private String name = "권규민";
    private int age = 29;
    private String email = "zpxxxx";
    private String address = "부산";

    //private일때 값을 넣거나 수정하는 방법\
    //1. 생성자

    public Student(String address, String email, int age, String name) {
        this.address = address;
        this.email = email;
        this.age = age;
        this.name = name;
    }

    //2. setter

    public void setName(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInfo() {
        System.out.println("이름은" + name);
        System.out.println("나이는" + age);
        System.out.println("이메일은" + email);
        System.out.println("주소는" + address);
    }
}

