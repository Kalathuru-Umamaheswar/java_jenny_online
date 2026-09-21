import java.util.ArrayList;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        System.out.println("Before set operation: ");
        System.out.println(list);
        list.set(2,"Z");
        System.out.println("After set operation: ");
        System.out.println(list);
        //ListIterator<String> it=list.listIterator();
       /* System.out.println("Previous Index: "+it.previousIndex());
        it.next();
        it.next();
        it.next();
        System.out.println("Next Index: "+it.nextIndex());
        System.out.println(it.previousIndex());*/
        //System.out.println(it.previousIndex());
        /*System.out.println("Forward Direction Iteration:");
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println();
        System.out.println("Backward Direction Iteration :");
        while (it.hasPrevious()){
            System.out.print(it.previous()+" ");
        } */
    }
}
