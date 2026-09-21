package me.jenny.oopexercises.interfaceexercises;

import java.util.Scanner;

public class ArithmeticOperationsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an Operation to perform :");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        int choice = sc.nextInt();
        System.out.println("Enter first number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second number :");
        int num2 = sc.nextInt();
        ArithmeticOperations operation;
        switch (choice) {
            case 1:
                operation = new Addition();
                //System.out.println(operation.calculate(num1, num2));
                break;
            case 2:
                operation = new Subtraction();
                //System.out.println(operation.calculate(num1, num2));
                break;
            case 3:
                operation = new Multiplication();
                //System.out.println(operation.calculate(num1, num2));
                break;
            case 4:
                operation = new Division();
                //System.out.println(operation.calculate(num1, num2));
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }
        double result=operation.calculate(num1,num2);
        System.out.println("The result is: "+result);
    }
}

