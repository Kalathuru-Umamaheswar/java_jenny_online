import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*ArrayList<Object> list=new ArrayList<>();
        list.add(7);
        list.add("Dhoni");
        list.add(true);
        System.out.println(list);*/

        ArrayList<Integer> list1=new ArrayList<>();
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
        System.out.println(list);

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
