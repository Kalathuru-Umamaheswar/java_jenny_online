package Thread;

public class Reverse  extends Thread{
    public void run(){
        for(int i=10;i>=0;i--){
            System.out.println(currentThread().getName()+" "+256+" * "+i+" = "+256*i);

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.getMessage();
            }
        }
    }
}
