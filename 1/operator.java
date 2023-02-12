public class operator {
    public static void main(String[] args) {
        int a = 3;
        float b = 2;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a++);
        System.out.println(--b);

        a = (int) ++b;
        System.out.println(a == b);

        if (!(a == 3 || ++b == 3))
            System.out.println("YUP");
        else
            System.out.println("NOO");

    }
}
