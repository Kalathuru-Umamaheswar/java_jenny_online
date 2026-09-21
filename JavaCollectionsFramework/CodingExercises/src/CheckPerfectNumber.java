import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number :");
        int num = sc.nextInt();
        int sum = 0;
        if (num < 1) {
            System.out.println("Invalid number");
        }
        else {
            System.out.println("The proper divisors of "+num+" are ");
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    System.out.print(i+" ");
                    sum += i;
                }
            }
            if (num == sum) {
                System.out.println("\n"+num + " is a perfect number");
            } else {
                System.out.println(num + " is not a perfect number  ");
            }
        }
    }
}
