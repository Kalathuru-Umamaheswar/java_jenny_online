package CodingExercises.com;

import java.util.Scanner;

public class CheckNumbersAreEqualWithoutEquality {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();
        if((num1^num2)==0)
            System.out.println("Given numbers are equal");
        else
            System.out.println("Given numbers are not equal.");
        /*
        System.out.println("Enter first number : ");
        int num1=sc.nextInt();
        System.out.println("Enter second number : ");
        int num2=sc.nextInt();
        if(num1-num2==0)
            System.out.println("Given numbers are equal");
        else
            System.out.println("Given numbers are not equal");

         */
    }
}
