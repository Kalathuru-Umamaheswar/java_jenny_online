package CodingExercises.com;

import java.util.Scanner;

public class PowerOfTwoUsingBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if((num&num-1)==0)
            System.out.println(num+" is power of two");
        else
            System.out.println(num+" is not power of two");
    }
}
