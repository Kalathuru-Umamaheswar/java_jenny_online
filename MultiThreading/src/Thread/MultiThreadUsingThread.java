package Thread;
/*class MyThread extends Thread { //In different class
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.print("1" + " ");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println("Thread has been Interrupted");
            }
        }
    }
}*/
/*public class MultiThreadUsingThread {
    void display(){
        for(int i=1;i<=5;i++){
            System.out.print("1"+" ");
        }
    } */
public class MultiThreadUsingThread extends Thread {
    public void run() { //within the same class
        for (int i = 1; i <= 5; i++) {
            System.out.print("1" + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread has been Interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultiThreadUsingThread obj = new MultiThreadUsingThread();
        //MyThread thread1=new MyThread();
        obj.start();
        //thread1.start();
        for (int i = 1; i <= 5; i++) {
            System.out.print("0" + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread has been Interrupted");
            }
        }
        System.out.println(Thread.currentThread().getName());
}
}
