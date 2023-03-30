@FunctionalInterface
interface Car {
    // void drive(int avg, int topSpeed);
    void drive(int avg);
}

public class lambdaExpression {
    public static void main(String args[]) {
        // Car obj = (avg, ts) -> System.out.println("Running with avg " + avg);
        // obj.drive(16, 140);
        Car obj = avg -> System.out.println("Running with avg " + avg);
        obj.drive(16);
    }
}