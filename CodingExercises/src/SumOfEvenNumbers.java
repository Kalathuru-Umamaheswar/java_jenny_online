import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        int sumEven=0;
        for(int i=1;i<=num;i++){
            if(i%2==0){
                sumEven += i;
            }
        }
        System.out.println("The sum of even numbers between 1 and "+num+" is "+sumEven);
    }
}
