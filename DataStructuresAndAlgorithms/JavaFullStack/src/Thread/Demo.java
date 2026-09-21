package Thread;

public class Demo {
    public static void main(String[] args) {
        Thread t=new Thread();
        System.out.println(t.getId());
        System.out.println(t.getName());
        System.out.println(t.getPriority());

        Thread n=new Thread("reddy");
        System.out.println(n.getId());
        System.out.println(n.getName());
        n.setName("vishnu");
        System.out.println(n.getName());
        System.out.println(n.getPriority());
        n.setPriority(2);
        System.out.println(n.getPriority());
    }
}
