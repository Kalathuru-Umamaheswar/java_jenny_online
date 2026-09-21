import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        //Iterating the Vector
        Vector<String> v=new Vector<>();
        v.add("Geeks");
        v.add("Geeks");
        v.add(1,"For");
        System.out.println(v);
        // Using the Get method and the for loop
        for(int i=0;i<v.size();i++){
            System.out.print(v.get(i)+" ");
        }
        System.out.println();
        for(String str:v){
            System.out.print(str+" ");
        }

        // Creating a default vector
        /*Vector v1=new Vector();
        v1.add(1);
        v1.add(2);
        v1.add("geeks");
        v1.add("forGeeks");
        System.out.println("Vector v1 is " + v1);
        v1.add(1,1.5);
        System.out.println("Vector v1 is " + v1);
        v1.set(3,true);
        System.out.println("The updated v1 vector is: "+v1);
        //Creating generic vector
        Vector<Integer> v2=new Vector<>();
        v2.add(1);
        v2.add(1,5);
        v2.add(2);
        v2.add(3);
        System.out.println("vector v2 is "+v2);
        v2.set(1,7);
        System.out.println("The updated v2 vector is: "+v2);
        v2.remove(1);
        System.out.println("After removing the updated vector is: "+v2); */

        //Updating Elements
        //Vector<String> v=new Vector<>(2);
        //v.add("A");
        //v.add("B");
        //v.add("C");
        //System.out.println(v);
        //System.out.println("Default Capacity :"+v.capacity()); //10
        /*System.out.println("Initial capacity: "+v.capacity());
        v.add("A");
        v.add("B");
        System.out.println("Capacity after adding 2 elements: "+v.capacity());
        v.add("C");
        System.out.println("Capacity after adding 3rd element: "+v.capacity());
        v.add("D");
        v.add("E");
        System.out.println("Capacity after adding 5 elements: "+v.capacity());
        v.add("F");
        v.add("G");
        v.add("H");
        System.out.println("Capacity after adding 8 elements: "+v.capacity());
        v.add("I");
        System.out.println("Capacity after adding 9 elements :"+v.capacity());
        System.out.println(v); */
    }
}
