import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Geeks");
        list.add("W3Schools");
        list.add("Udemy");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        for(String str : list){
            System.out.print(str+" ");
        }
        //System.out.println(list);
        //System.out.println(list.contains("Udemy"));



        //list.add(1,"For");
        //list.set(1,"For");
//        System.out.println(list);
//        System.out.println(list.indexOf("Geeks"));
//        System.out.println(list.lastIndexOf("Geeks"));
//        System.out.println(list.remove("Geeks"));
//        System.out.println(list);
//        System.out.println(list.remove(0));
//        System.out.println(list);
    }
}
