import java.util.ArrayList;
import java.util.List;
public class arrayList {
    public static void main(String[] args) {

        ArrayList a = new ArrayList();
        a.add(1);
        a.add(2);
        a.add(3);
        System.out.println(a);

        ArrayList b = new ArrayList();
        b.add("YASH");
        b.add(1.1);
        b.add('b');
        System.out.println(b);

        b.addAll(a);
        System.out.println(b);

        System.out.println(b.indexOf(2));
        System.out.println(b.contains(2));
        b.ensureCapacity(10);
        b.trimToSize();
        System.out.println(b);

        List c = new ArrayList();
        c.addAll(b);
        System.out.println(c);
    }
}