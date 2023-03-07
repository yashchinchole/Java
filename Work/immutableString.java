public class immutableString {
    public static void main(String[] args) {

        String s1 = "Git"; // Create an immutable string
        s1.concat("Hub"); // Concatenate with the string but won't change s1
        System.out.println(s1); // It will print Git

        final StringBuilder s2 = new StringBuilder("Git"); // Create a mutable string builder
        s2.append("Hub"); // Append to the string builder
        System.out.println(s2); // Prints GitHub

        final StringBuffer s3 = new StringBuffer("Git"); // Create a mutable string buffer
        s3.append("Hub"); // Append to string buffer
        System.out.println(s3); // Prints GitHub

        // StringBuffer s4 = new StringBuffer("ChatGPT"); // Create a second string
        // buffer
        // s2 = s4; // Won't work since s2 is declared as final
    }
}
