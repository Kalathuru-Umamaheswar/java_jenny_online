import java.util.Scanner;

public class EvenOddUsingBitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if((num & 1) == 0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }
    }

}
