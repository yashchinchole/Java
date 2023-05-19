import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Number");
        float a = s.nextFloat();
        System.out.println("Number : " + a);

        System.out.println("Name");
        String b = s.next();
        System.out.println("Name : " + b);

        s.close();
    }
}
