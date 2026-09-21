package Thread;

public class ThreadDemo {
    void display(){
        for(int i=1;i<=5;i++){
            System.out.print("1"+" ");
        }
    }
    public static void main(String[] args) {
        ThreadDemo obj=new ThreadDemo();
        obj.display();
        for(int i=1;i<=5;i++){
            System.out.print("0"+" ");
        }
        Thread currentThread=Thread.currentThread();
        System.out.println();
        System.out.println(currentThread.getName()); //the name of the thread is main
        System.out.println(currentThread.getPriority());
        System.out.println(currentThread.getId());
        System.out.println(currentThread.getState());
        System.out.println(currentThread.isAlive());
        System.out.println(currentThread.isDaemon());
    }
}
