class test {
    public double add(int a, double b) {
        return a + b;
    }

    public double add(int a, double b, char c) {
        return a + b + c;
    }
}

public class object {
    int n = 0;
    String name = "YASH";

    public static void main(String[] args) {

        object obj1 = new object();
        object obj2 = new object();

        obj1.name = "PRASAD";
        obj2.n = 5;

        System.out.println(obj1.n + "  " + obj1.name);
        System.out.println(obj2.n + "  " + obj2.name);

        test t = new test();
        System.out.println(t.add(5, 5.5));
        System.out.println(t.add(5, 5.5, 'Y'));
    }
}
