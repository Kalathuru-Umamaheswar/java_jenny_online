package CodingExercises.com;

import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=sc.nextInt();
        int sum=0;
        if(num<1){
            System.out.println("Invalid number.");
        }
        else{
            for(int i=1;i<=num/2;i++){ //12 1,3,6,4
                if(num%i==0){
                    sum += i;
                }
            }
            if(num==sum){
                System.out.println(num+" is a perfect number.");
            }
            else{
                System.out.println(num+" is not a perfect number.");
            }
        }

    }
}
