import java.util.HashSet;

public class HashSetdemo {
    public static void main(String[] args) {
        /*HashSet<String> set=new HashSet<>();
        set.add("Ravi");
        set.add("Raju");
        set.add("Roshan");
        //set.add("Roshan");
        System.out.println(set.contains("Ravi"));
        set.remove("Roshan");
        System.out.println(set.size());
        //set.add(1);
        //set.add(2);
        //set.add(1);
        System.out.println(set); */
        HashSet<String> cars=new HashSet<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("AUDI");
        cars.add("BENZ");
        for(String i : cars){
            System.out.println(i);
        }
    }
}
