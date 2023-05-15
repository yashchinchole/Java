import java.util.ArrayList;
import java.util.Collections;

public class collectionsMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(100);
        al.add(700);
        al.add(200);
        al.add(400);
        al.add(300);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(Collections.binarySearch(al, 200));
        System.out.println(Collections.binarySearch(al, 500));
        Collections.shuffle(al);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(Collections.max(al));
        System.out.println(Collections.min(al));
        System.out.println(Collections.frequency(al, 500));
        Collections.rotate(al, 2);
        System.out.println(al);
    }
}
