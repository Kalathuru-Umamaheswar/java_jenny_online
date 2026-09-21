package CodingExercises.com;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n=sc.nextInt();
        boolean isPrime=true;
        for(int i=2;i<n;i++){
            if(n%i==0) {
                System.out.println(n + " is not a prime number.");
                isPrime=false;
                break;
            }
        }
        if(isPrime){
            System.out.println(n+" is a prime number.");
        }
    }
}
