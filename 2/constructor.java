class Studentc {
    private int age;
    private String name;

    Studentc(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class constructor {
    public static void main(String[] args) {

        Studentc student1 = new Studentc("Yash", 18);
        int a1 = student1.getAge();
        String n1 = student1.getName();
        System.out.println(a1 + " " + n1);

        Studentc student2 = new Studentc("Vijay", 20);
        int a2 = student2.getAge();
        String n2 = student2.getName();
        System.out.println(a2 + " " + n2);
    }
}
