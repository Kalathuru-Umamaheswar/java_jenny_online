import java.util.Scanner;

public class IfElseCodingExercise {
    public static void main(String[] args) {
        //Check if a number is positive or negative
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        if(num>=0){
            System.out.println("Positive Number");
        }
        else{
            System.out.println("Negative Number");
        }*/
        //Maximum among two numbers
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number :");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num2 is greater than num1");
        }*/
        //Addition and Subtraction of two numbers
        Scanner sc = new Scanner(System.in);
        int choice;
        int a,b;
        System.out.println("Enter 1 for Addition :");
        System.out.println("Enter your choice :");
        choice = sc.nextInt();
        System.out.println("Enter first number :");
        a = sc.nextInt();
        System.out.println("Enter second number :");
        b = sc.nextInt();
        if(choice==1) {
            int sum = a + b;
            System.out.println("Addition :" + sum);
        }
        else{
            int sub = a-b;
            System.out.println("Subtraction :" + sub);
        }
    }
}
