import java.util.*;

public class mapDemo {
    public static void main(String[] args) {

        // Hashtable ht = new Hashtable();
        HashMap hm = new HashMap();
        // hm.put(null, null);
        hm.put(01, "YASH");
        hm.put(02, "GITHUB");
        hm.put(03, "GFG");
        hm.put(04, "LEETCODE");
        System.out.println(hm);

        LinkedHashMap hm2 = new LinkedHashMap();
        hm2.put("CHINCHOLE", "YASH");
        hm2.put("BOT", "YASH");
        hm2.put("OPENAI", "CHATGPT");
        System.out.println(hm2);

    }
}
