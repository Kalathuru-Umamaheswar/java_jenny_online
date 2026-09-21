import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> cars=new LinkedHashSet<>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("BENZ");
        System.out.println(cars);
        System.out.println(cars.contains("Mazda"));
        cars.remove("volvo");
        System.out.println(cars);
        System.out.println(cars.size());
    }
}
