// Anagram

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {

        String s1 = "Yash Prasad";
        String s2 = "Pash Yrasad";
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();

        // sorting the character arrays in lexicographical order
        Arrays.sort(a1);
        Arrays.sort(a2);

        // checking if the sorted character arrays are equal
        System.out.println((Arrays.equals(a1, a2)) ? "Anagram" : "NOT Anagram");
    }
}