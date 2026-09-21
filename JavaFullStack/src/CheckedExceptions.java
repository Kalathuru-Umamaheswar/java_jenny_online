public class CheckedExceptions  extends Thread{
    @Override
    public void run(){
        System.out.println("Run method");
        for(int i=1;i<=10;i++){
            System.out.println("i: "+i);
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){
                //e.printStackTrace();
                System.out.println("Exception");
            }
        }
    }
    public static void main(String[] args) {
        CheckedExceptions obj=new CheckedExceptions();
        obj.start();
        obj.start();
    }
}
