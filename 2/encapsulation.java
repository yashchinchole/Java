class Student {
    private int age;
    private String name;

    public void setData() {
        age = 20;
        name = "YASH";
    }

    public void show() {
        System.out.println(age + " " + name);
    }
}

public class encapsulation {
    public static void main(String[] args) {

        Student student = new Student();
        student.setData();
        student.show();
    }
}
