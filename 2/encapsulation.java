class Studentb {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class encapsulation {
    public static void main(String[] args) {

        Studentb student1 = new Studentb();
        student1.setAge(18);
        student1.setName("YASH");
        int a1 = student1.getAge();
        String n1 = student1.getName();
        System.out.println(a1 + " " + n1);

        Studentb student2 = new Studentb();
        student2.setAge(22);
        student2.setName("NotesHub");
        int a2 = student2.getAge();
        String n2 = student2.getName();
        System.out.println(a2 + " " + n2);
    }
}
