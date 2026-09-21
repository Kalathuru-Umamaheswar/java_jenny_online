package CodingExercises.com;

import java.util.Scanner;

public class CountDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        int originalNumber=n;
        int count=0;
        if(n==0){
            count=1;
        }
        while(n!=0){
            int remainder=n%10;
            count++;
            n=n/10;
        }
        System.out.println("Number of digits in a number "+originalNumber+" is "+count);
    }
}
