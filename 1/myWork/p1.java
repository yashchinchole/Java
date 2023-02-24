class A1 {
    public String removeDuplicates(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            boolean isExist = false;
            for (int j = 0; j < result.length(); j++) {
                if (s.charAt(i) == result.charAt(j)) {
                    isExist = true;
                    break;
                }
            }
            if (!isExist)
                result += s.charAt(i);
        }
        return result;
    }
}

public class p1 {

    public static void main(String[] args) {
        String s = "abbbccddeff";
        A1 a = new A1();
        System.out.println(a.removeDuplicates(s));
    }

}
