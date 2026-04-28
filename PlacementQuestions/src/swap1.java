import java.util.Scanner;

public class swap1 {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a :");
        a = sc.nextInt();
        System.out.println("Enter the value of b :");
        b = sc.nextInt();
        System.out.println("Before swapping the value of a and b : "+a+ " " +b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping the values of a and b are : "+a + " "+b);

    }
}
