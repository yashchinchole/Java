public class tryCatchBlock {
    public static void main(String[] args) {

        int ans = 0;
        int x = 6;
        int y = 2;
        int[] a = { 1, 2, 3, 4 };
        // String s = null;

        try {
            ans = x / y;
            System.out.println(a[5]);
            // System.out.println(s.length());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Exception");
        }
        System.out.println(ans);
        System.out.println("THE END");
    }
}
