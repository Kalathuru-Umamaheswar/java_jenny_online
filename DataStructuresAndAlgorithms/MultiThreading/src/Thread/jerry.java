package Thread;

public class jerry implements Runnable{
    @Override
    public void run() {
        for (int i = 6; i <= 10; i++) {
            System.out.println("i: " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}
