class Father {
    int age;
}

class Child extends Father {
    void display() {
        System.out.println(age);
    }
}

// class Daughter extends Father {
// }

class GrandChild extends Child {
    void display() {
        System.out.println(age);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.display();
        GrandChild obj2 = new GrandChild();
        obj2.display();
    }
}
