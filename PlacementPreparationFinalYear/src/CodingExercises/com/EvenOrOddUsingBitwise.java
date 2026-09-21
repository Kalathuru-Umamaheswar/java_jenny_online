package CodingExercises.com;

import java.util.Scanner;

public class EvenOrOddUsingBitwise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        if((num&1)==0){
            System.out.println(num+" is a even number");
        }
        else{
            System.out.println(num+" is a odd number");
        }
    }
}
