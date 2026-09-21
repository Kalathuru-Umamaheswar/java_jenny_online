package Thread;

public class Main {
    public static void main(String[] args) {
        Swiggy s=new Swiggy();
        s.setName("SWIGGY");
        System.out.println(s.getName());
        s.start();
        Phonepe p=new Phonepe();
        Thread t=new Thread(p);
        t.setName("PHONEPE");
        System.out.println(t.getName());
        t.start();
    }
}
