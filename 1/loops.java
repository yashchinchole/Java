import java.util.Scanner;

public class loops {
    public static void main(String[] args) {

        int i;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Value");
            int n = s.nextInt();

            switch (n) {
                case 1:
                    System.out.println("for");
                    for (i = 0; i < 5; i++)
                        System.out.println(1);
                    break;

                case 2:
                    System.out.println("while");
                    i = 0;
                    while (i < 5) {
                        System.out.println(2);
                        i++;
                    }
                    break;

                case 3:
                    System.out.println("do while");
                    i = 0;
                    do {
                        System.out.println(3);
                        i++;
                    } while (i < 5);
                    break;

                default:
                    System.out.println("default");
                    System.out.println(0);
            }
        }
    }
}
