import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

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
            Integer i = (Integer) it.next();
            System.out.println(i);
        }

        Collection values = map.values();
        Iterator it2 = values.iterator();
        while (it2.hasNext()) {
            String i = (String) it.next();
            System.out.println(i);
        }

        Set entrySet = map.entrySet();
        Iterator itr3 = entrySet.iterator();

        while (itr3.hasNext()) {
            Map.Entry data = (Entry) itr3.next();
            System.out.println(data.getKey() + " : " + data.getValue());
        }
    }
}