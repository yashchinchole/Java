class A {
    public void show() {
        System.out.println("in A show");
    }

    // static class B {
    class B {
        public void display() {
            System.out.println("in display");
        }
    }
}

public class innerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        // A.B obj1 = new A.B();
        obj1.display();
    }
}