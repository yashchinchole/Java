interface Car {
    void drive();
}

public class annoymous {
    public static void main(String[] args) {
        Car obj = new Car() {
            public void drive() {
                System.out.println("Running");
            }
        };
        // Car obj = () -> System.out.println("Running");
        obj.drive();
    }
}