// Print Duplicates Characters rom the String

class p2 {
    public static void print(String str) {

        int[] count = new int[256];

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            count[ch]++;

            if (count[ch] > 1) {
                System.out.print(str.charAt(i));
            }
        }
    }
}

public class p2PrintDuplicates {
    public static void main(String[] args) {

        p2.print("abbbccddeffgg");

    }
}
