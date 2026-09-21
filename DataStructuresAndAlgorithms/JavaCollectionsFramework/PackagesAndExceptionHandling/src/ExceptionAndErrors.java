import java.util.Scanner;

public class ExceptionAndErrors {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       String str=null;
       try{
           System.out.println(str.length());
       }
       catch (NullPointerException iob){
           System.out.println(iob);
       }













       /* String str=null;
        try {
            System.out.println(str.length());
        }
        catch(NullPointerException e){
            System.out.println(e);
        } */
        /*try {
            System.out.println("Enter first number :");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number :");
            int num2 = sc.nextInt();
            int result = num1 / num2;
            System.out.println("Result :" + result);

        }
        catch(ArithmeticException ae){
            System.out.println("Num2 cannot be negative"+ae);
        } */
        //System.out.println("Out from main");
    }
}
