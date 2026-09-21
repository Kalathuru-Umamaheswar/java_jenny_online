package CodingExercises.com;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number : ");
        int n=sc.nextInt();
        int term1=0,term2=1;
        int nextTerm=0;
        if(n<=0)
            System.out.println("Enter a positive number");
        else if(n==1) {
            System.out.println(term2);
            System.out.println(n+"th fibonacci number is "+term1);
        }
        else{
            System.out.print("The fibonacci Series is "+term1+" "+term2);
            for(int i=3;i<=n;i++){
                nextTerm=term1+term2;
                System.out.print(" "+nextTerm);
                term1=term2;
                term2=nextTerm;
            }
            System.out.println();
            System.out.println(n+"th fibonacci number is : "+nextTerm);
        }
    }
}
