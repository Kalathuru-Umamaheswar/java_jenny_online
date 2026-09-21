import java.util.Scanner;

public class SimpleIfCodingExercise {
    public static void main(String[] args) {
        //Check number is positive
        /* sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        if(num>0)
            System.out.println("You entered positive number");*/
        //Check if a person is eligible for senior citizen discount
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter age :");
        int age = sc.nextInt();
        if(age>65){
            System.out.println("You are eligible for senior citizen discount");
        }
        System.out.println("Outside if"); */
        //Check the number is even , positive or negative
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println("Even Number");
        if(num==0)
            System.out.println("Zero");
        if(num>0)
            System.out.println("Positive Number");

    }
}
