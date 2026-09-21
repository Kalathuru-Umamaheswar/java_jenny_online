import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LLDemo {
    public static void main(String[] args) {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");
        System.out.println(ll);
        LinkedList<Integer> list=new LinkedList<>(List.of(10,20,30,40,50));
        System.out.println(list) ;
        Iterator<String> revItr=ll.descendingIterator();
        while(revItr.hasNext()){
            System.out.println(revItr.next());
        }
        Iterator<Integer> itr=list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        //System.out.println(ll.contains("B"));

        /*ll.add(1,"F");
        System.out.println(ll);
        ll.set(1,"updated");
        System.out.println(ll);
        System.out.println(ll.remove(1));
        System.out.println(ll);
        System.out.println(ll.remove("C"));
        System.out.println(ll);
        for(int i=0;i<ll.size();i++){
            System.out.print(ll.get(i)+" ");
        }
        System.out.println();
        ll.addFirst("Z");
        System.out.println(ll);
        ll.addLast("Y");
        System.out.println(ll); */
    }
}
