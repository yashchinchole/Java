interface A {
    int age = 20;

    void show();
}

interface B {
    void display();
}

class child implements A, B {
    public void show() {
        System.out.println("SHOW");
    }

    public void display() {
        System.out.println("DISPLAY");
    }
}

public class interfaceDemo {
    public static void main(String[] args) {
        System.out.println(A.age);

        A o = new child();
        o.show();

        child obj = new child();
        obj.show();
        obj.display();
    }
}