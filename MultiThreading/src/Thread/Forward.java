package Thread;


import static java.lang.Thread.currentThread;

public class Forward implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(currentThread().getName()+" "+652+" * "+i+" = "+652*i);
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.getMessage();
            }
        }
    }
}
