import java.util.*;

public class linkedList {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(300);
        System.out.println(ll);
        
        ll.addFirst("YASH");
        ll.addLast(100);
        System.out.println(ll);

        System.out.println(ll.get(1));
        System.out.println(ll.indexOf(300));
        System.out.println(ll.lastIndexOf(300));
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.poll());
        System.out.println(ll);

        ll.push(10);
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll);
    }
}
