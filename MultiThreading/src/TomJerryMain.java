package Thread;
public class TomJerryMain {
    public static void main(String[] args) {
        Tom t=new Tom();
        t.start();
        Thread j=new Thread(new jerry());
        j.start();
    }
}
