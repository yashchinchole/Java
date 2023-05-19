// final class Animal {
//     void sleep() {
//         System.out.println("YASH");
//     }
// }

class Animal {

    final int age = 20;

    final void sleep() {
        // age = 22;
        System.out.println("YASH");
    }
}

class Tiger extends Animal {
    // void sleep() {
    // System.out.println("YASH");
    // }
}

public class finalClass {
    public static void main(String[] args) {

        Tiger t = new Tiger();
        t.sleep();

    }
}