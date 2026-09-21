import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int term1=0,term2=1,nextTerm=0;
        if(num<=0){
            System.out.println("Please enter positive number");
        }
        else if(num == 1){
            System.out.println("The fibonacci series is : "+term1);
            System.out.println("The "+num+"th fibonacci number is "+term1);
        }
        else if(num == 2){
            System.out.println("The fibonacci series is : "+term1+" "+term2);
            System.out.println("The "+num+"th fibonacci number is "+term2);
        }
        else{
            System.out.print("The Fibonacci Series is : "+term1+" "+term2);
            for(int i=3;i<=num;i++)
            {
                nextTerm = term1 + term2;
                System.out.print(" "+nextTerm);
                term1 = term2;
                term2 = nextTerm;
            }
            System.out.println("\nThe "+num+"th fibonacci number is: "+nextTerm);
        }
    }
}
