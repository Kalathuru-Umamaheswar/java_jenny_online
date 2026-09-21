import java.util.Scanner;

public class maxAmongThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :"); //First prompting the input from the user and after read
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        System.out.println("Enter third number :");
        int c = sc.nextInt();
        int max = a>b ? (a>c ? a : c) : (b>c ? b : c);
        System.out.println("The maximum number is :" + max);
    }
}
