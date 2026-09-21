import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        int sumOfDigits = 0;
        for(;num != 0;num /= 10){
            int remainder = num % 10;
            sumOfDigits += remainder;
        }
        System.out.println(sumOfDigits);
    }
}
