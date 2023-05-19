class Studenta {

    int age = 5; // instance variable, non - static variable
    static String school; // non - instance variable, static variable

    static {
        school = "PW";
    }

    public void show() {
        System.out.println("in show " + age + " " + school); // static variable can be accessed in non-static method
    }

    public static void study() {
        System.out.println("studying "); // non-static variable cannot be accessed here
    }
}

public class staticKeyword {

    static {
        System.out.println("in static block");
    }

    public static void main(String[] args) {

        System.out.println("in main method");

        Studenta obj = new Studenta();

        Studenta.study();
        obj.age = 19;
        // obj.school = "PWSkills";
        Studenta.school = "PWSkills";

        Studenta obj1 = new Studenta();
        System.out.println(Studenta.school);

        obj.show(); // in show 19 PWSkills
        obj1.show(); // in show 0 ?

    }
}