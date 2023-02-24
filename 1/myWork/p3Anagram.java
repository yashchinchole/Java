// Anagram

import java.util.Arrays;

public class p3Anagram {
    public static void main(String[] args) {

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
    }
}
