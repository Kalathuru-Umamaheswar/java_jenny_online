import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*ArrayList list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("uma");
        System.out.println(list);*/
        ArrayList<String> list=new ArrayList<>();
        list.add("Ravi");
        list.add("Rahul");
        list.add("Arjun");
        System.out.println(list);
        list.add(0,"Tendulkar");
        System.out.println(list);
    }
}
