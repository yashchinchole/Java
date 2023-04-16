import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashMap {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, "YASH");
        map.put(2, "GOOGLE");
        map.put(3, "MICROSOFT");
        map.put(4, "OPENAI");

        System.out.println(map);
        System.out.println(map.get(3));

        Set set = map.keySet();
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        Collection values = map.values();
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    }
}