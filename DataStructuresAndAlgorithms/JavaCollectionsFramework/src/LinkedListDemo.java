import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Object> list1=new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        System.out.println(list1);
        list1.addFirst(5);
        System.out.println(list1);
        list1.addLast(35);
        list1.add("jenny");
        System.out.println(list1);
        System.out.println(list1.getFirst());
        list1.removeFirst();
        System.out.println(list1);
        list1.removeLast();
        System.out.println(list1);
    }
}
