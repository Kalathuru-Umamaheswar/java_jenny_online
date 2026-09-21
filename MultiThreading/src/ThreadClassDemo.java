class MyThread1 extends Thread{
   /* MyThread1(ThreadGroup groupName,String name){
        super(groupName,name);
    }*/
    @Override
    public void run(){
        System.out.println("Task 3 started...");
        for(int i=1;i<=100;i++){
            System.out.println(i+" MyRun");
        }
      System.out.println("Task 3 completed");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println("Thread_MyThread group : "+Thread.currentThread().getThreadGroup());
    }
}
    class MyRun implements Runnable{
        @Override
        public void run(){
            System.out.println("Task 1 started...");
            for(int i=1;i<=100;i++){
                System.out.println(i+" MyRun");
                //Thread.yield();
            }
            System.out.println("Task 1 completed");
            //System.out.println(Thread.currentThread().getName());
            //System.out.println("Thread_MyRun group : "+Thread.currentThread().getThreadGroup());
        }
    }
    public class ThreadClassDemo {
        public static void main(String[] args) throws InterruptedException {
        MyRun obj=new MyRun();
        Thread thread1=new Thread(obj);
        MyThread1 thread2=new MyThread1();

            ThreadGroup tg=new ThreadGroup("MyGroup");
        //Thread thread1=new Thread(tg,new MyRun(),"Thread_MyRun");
        thread2.start();
        thread2.join(); //join() is used to make one thread wait until another thread finishes its execution.

//            MyThread1 thread2=new MyThread1(tg,"Thread_MyThread1");
//            thread2.start();
//            System.out.println("Active threads in MyGroup  :"+tg.activeCount());
        System.out.println("Task2 started..");
        for(int i=1;i<=100;i++){
            //System.out.print("2"+" ");
            System.out.println(i+" Main thread");
            //Thread.yield();
        }
       System.out.println("Task2 completed");
//        System.out.println(Thread.currentThread().getName());
//        System.out.println("Main Thread  group : "+Thread.currentThread().getThreadGroup());
        //Thread currentThread=Thread.currentThread();
        // System.out.println();
//        System.out.println(currentThread.getName()); //the name of the thread is main
//        System.out.println(currentThread.getPriority());
//        System.out.println(currentThread.getId());
//        System.out.println(currentThread.getState());
//        System.out.println(currentThread.isAlive());
//        System.out.println(currentThread.isDaemon());
    }
}
