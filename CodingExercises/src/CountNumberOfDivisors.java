import java.util.Scanner;

public class CountNumberOfDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num % i == 0){
                System.out.println(i+" is a divisor of "+num);
                count++;
            }
        }
        System.out.println("The number of divisors of "+num+" are :"+count);
    }
}
