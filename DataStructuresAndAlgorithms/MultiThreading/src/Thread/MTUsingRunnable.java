package Thread;
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Task1 started...");
        for (int i = 0; i <= 10; i++) {
            System.out.print("1" + " ");
        }
        System.out.println("Task1 completed");
    }

    static class MyThreadd extends Thread {
        @Override
        public void run() {
            System.out.println("Task3 started...");
            for (int i = 0; i <= 10; i++) {
                System.out.print("1" + " ");
            }
            System.out.println("Task3 completed");
        }
    }

    public class MTUsingRunnable {
        public static void main(String[] args) {
            MyRunnable task = new MyRunnable();
            Thread thread1 = new Thread(task);
            thread1.start();
            //Thread thread2=new Thread(task);
            //thread2.start();
            MyThreadd thread2 = new MyThreadd();
            thread2.start();
            System.out.println("Task2 started...");
            for (int i = 0; i <= 10; i++) {
                System.out.print("0" + " ");
            }
            System.out.println("Task2 completed");
            System.out.println("Main completed");

        }
    }
}
