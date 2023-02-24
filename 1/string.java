
//importing the Arrays library from java.util
import java.util.Arrays;

public class string {
    public static void main(String[] args) {

        // Create a new String 's1' with value "YASH" and concatenate "CHINCHOLE" to it
        String s1 = "YASH";
        s1 = s1.concat("CHINCHOLE");

        // Create a new StringBuilder object 's2' with value "YASH" and append
        // "CHINCHOLE" to it
        StringBuilder s2 = new StringBuilder("YASH");
        s2 = s2.append("CHINCHOLE");

        System.out.println(s1);
        System.out.println(s2);

        // Create two strings 's3' and 's4' with value "YASH" and print whether they
        // point to same reference or not
        String s3 = "YASH";
        String s4 = "YASH";
        System.out.println(s3 == s4);

        // Create a string 's5' with value "YASHYASH100500"
        String s5 = s3 + s4 + 100 + 500;
        System.out.println(s5);

        // Create two new Strings 's6' and 's7' using new operator with value "YASH" and
        // print whether they are equal as well as ignore case
        String s6 = new String("YASH");
        String s7 = new String("YASH");
        String s8 = new String("yash");
        System.out.println(s6 == s7);
        System.out.println(s6.equals(s7));
        System.out.println(s6.equalsIgnoreCase(s8));

        // Create a new String 's9' with value "Yash Chinchole" and perform various
        // operations on it
        String s9 = "Yash Chinchole";
        System.out.println(s9.toUpperCase());
        System.out.println(s9.toLowerCase());
        System.out.println(s9.indexOf("h"));
        System.out.println(s9.length());
        System.out.println(s9.substring(5, 9));

        // Create a new String 's10' with value "Yash" and reverse it to get 's11'
        String s10 = "Yash";
        String s11 = "";
        for (int i = s10.length() - 1; i >= 0; i--)
            s11 += s10.charAt(i);
        System.out.println(s11);

        // Create a new String 's12' with value "Yash Chinchole" and split it to get
        // 'sa', then reverse it in a 'loop' to get 's13'
        String s12 = "Yash Chinchole";
        String s13 = "";
        String sa[] = s12.split(" ");
        for (int i = sa.length - 1; i >= 0; i--)
            s13 += sa[i];
        System.out.println(s13);

        // Code block to check if two strings are anagrams
        String s14 = "Yash Prasad";
        String s15 = "Pash Yrasad";
        s14 = s14.replace(" ", "");
        s15 = s15.replace(" ", "");
        s14 = s14.toLowerCase();
        s15 = s15.toLowerCase();
        char a1[] = s14.toCharArray();
        char a2[] = s15.toCharArray();

        // sorting the character arrays in lexicographical order
        Arrays.sort(a1);
        Arrays.sort(a2);

        // checking if the sorted character arrays are equal
        System.out.println((Arrays.equals(a1, a2)) ? "Anagram" : "NOT Anagram");

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
