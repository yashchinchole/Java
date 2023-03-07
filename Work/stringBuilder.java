public class stringBuilder {
    public static void main(String[] args) {

        StringBuilder s1 = new StringBuilder();
        s1.append("GitHub");
        System.out.println(s1.capacity());
        s1.append("YASHPRASADCHINCHOLE");
        System.out.println(s1.capacity());

        StringBuilder s2 = new StringBuilder(100);
        System.out.println(s2.capacity());
        s2.append("VSCode");
        s2.trimToSize();
        System.out.println(s2.capacity());

        StringBuffer s3 = new StringBuffer("Google");
        System.out.println(s3.capacity());
        s3.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(s3.capacity());

    }
}
