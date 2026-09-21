import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
     ArrayList<String> fruits=new ArrayList<>();
     ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3,4,5));
     System.out.print(list+" ");
     System.out.println();
     fruits.add("Apple");
     fruits.add("Mango");
     fruits.add("banana");
     fruits.add("Guava");
     fruits.add("Mango");
     System.out.println(fruits);
     System.out.println(fruits.indexOf("Mango"));
     System.out.println(fruits.lastIndexOf("Mango"));


     List<String> sub=fruits.subList(1,3);
     System.out.println(sub);

     /*ArrayList list=new ArrayList<>();
     list.add(10);
     list.add("Dhoni");
     list.add(true);
     /*for(int i=0;i<list.size();i++){
      System.out.println(list.get(i));
     }*/
     /*Iterator it=list.iterator();
     while(it.hasNext()){
      System.out.println(it.next());
     }
     list.add(30);
     System.out.println(list);
     list.add(0,"Rahul");
     System.out.println(list);
     System.out.println(list.get(2));
     list.remove(true);
     System.out.println(list);
     list.remove(1);
     System.out.println(list);
     list.removeFirst();
     System.out.println(list);
     list.removeLast();
     System.out.println(list);
     list.add(10);
     list.add(20);
     System.out.println(list);
     list.add("RCB");
     list.add("CSK");
     System.out.println(list);
     System.out.println(list.contains(10));
     System.out.println(list.indexOf("RCB"));
     ArrayList<String> list1=new ArrayList<>();
     list1.add("RCB");
     list1.add("CSK");
     System.out.println(list1);
     list.removeAll(list1);
     System.out.println(list);
     list.set(1,"Updated");
     System.out.println(list);*/




        /*ArrayList<Object> list=new ArrayList<>();
        list.add(7);
        list.add("Dhoni");
        list.add(true);
        System.out.println(list);*/

       /* ArrayList<Integer> list1=new ArrayList<>();
        list1.add(0);
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1);
        ArrayList<Double> list2=new ArrayList<>();
        list2.add(10.2);
        list2.add(20.3);
        list2.add(30.4);
        list2.add(56.7);
        System.out.println(list2);

        ArrayList<Object> list=new ArrayList<>();
        list.addAll(list1);
        list.addAll(list2);
        System.out.println(list);*/

       /* Scanner sc=new Scanner(System.in);
        System.out.println("Enter size :");
        int n=sc.nextInt();
        ArrayList<Object> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(sc.next());
        }
        System.out.println(list);
        list.add(12);*/


        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size :");
        int n=sc.nextInt();
        ArrayList<String> obj=new ArrayList<>();
        for(int i=0;i<n;i++){
            obj.add(sc.next());
        }
        System.out.println(obj);
        System.out.println(obj.contains("Hello"));
        obj.set(0,"First");
        System.out.println(obj.get(0)); */

        /*ArrayList<Object> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add("uma");
        System.out.println(list);*/
        /*ArrayList<String> list=new ArrayList<>();
        list.add("Ravi");
        list.add("Rahul");
        list.add("Arjun");
        System.out.println(list);
        list.add(0,"Tendulkar");
        System.out.println(list); */
    }
}
