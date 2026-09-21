import java.util.ArrayList;
import java.util.Iterator;

public class iteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        Iterator<String> it=list.iterator();;
        while(it.hasNext()){
            String str=it.next();
            if(str.equals("C")){
                it.remove();
            }
        }
        System.out.println();
        System.out.println(list);
    }
}
