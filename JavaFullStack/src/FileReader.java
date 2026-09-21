import java.io.File;

public class FileReader {



    public static void main(String[] args) {
        try{
            File r=new File("EH1.java");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
