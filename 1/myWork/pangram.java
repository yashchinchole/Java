// Pangram

public class pangram {
    public static void main(String[] args) {

        String str = "the quick brown fox jumps over the lazy dog";
        str = str.replace(" ", "").toLowerCase();
        int flag = 1;

        // create an array of alphabet
        boolean[] array = new boolean[26];

        // iterate through each character and set the value at corresponding index to
        // true
        for (int i = 0; i < str.length(); i++)
            array[str.charAt(i) - 'a'] = true;

        // iterate through the array and check if any value is false
        for (int i = 0; i < 26; i++)
            if (array[i] == false) {
                flag = 0;
                break;
            }

        System.out.println((flag == 1) ? "Pangram" : "NOT Pangram");
    }
}
