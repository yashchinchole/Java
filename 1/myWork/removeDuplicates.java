// Remove Duplicates from a String

class p1 {

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

public class removeDuplicates {

    public static void main(String[] args) {
        String s = "abbbccddeff";
        p1 a = new p1();
        System.out.println(a.removeDuplicates(s));
    }

}
