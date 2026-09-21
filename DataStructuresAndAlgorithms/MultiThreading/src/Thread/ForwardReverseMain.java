package Thread;

public class ForwardReverseMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Forward obj=new Forward();
        Thread thread=new Thread(obj);

        thread.start();
        Reverse obj1=new Reverse();
        obj1.start();

    }
}
