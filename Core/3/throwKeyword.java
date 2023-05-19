public class throwKeyword {
    public static void main(String args[]) {

        int num1 = 6;
        int num2 = -2;

        try {
            if (num2 < 0) {
                Exception e = new Exception();
                throw e;
                // throw new ArithmeticException("-ve Number");
            } else {
                int result = num1 / num2;
                System.out.println(result);
            }
        } catch (Exception e) {
            System.out.println("Enter a valid number");
        }

    }
}