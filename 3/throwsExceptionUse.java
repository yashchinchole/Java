// handling vs ducking

class Demo {
    public void a() throws Exception {
        System.out.println("in a");

        b();
    }

    public void b() throws Exception {
        int num1 = 9;
        int num2 = 0;

        int result = num1 / num2;
        System.out.println(result);
    }
}

public class throwsExceptionUse {
    public static void main(String[] agrs) {
        Demo obj = new Demo();
        try {
            obj.a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
