import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
        //check if a number is positive and if so, whether it's even or odd
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        if(num>0){
            if(num%2==0){
                System.out.println("Even Number");
            }
            else{
                System.out.println("Odd Number");
            }
        }
        else{
            System.out.println("You Entered Negative Number");
        } */
        //check if a person is eligible to vote or not
        int age;
        boolean isCitizen;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        age = sc.nextInt();
        if(age>=18){
            System.out.println("Are you citizen of India :");
            isCitizen = sc.nextBoolean();
            if(isCitizen){
                System.out.println("You are eligible to vote");
            }
            else{
                System.out.println("apply for Indian Citizenship first");
            }
        }
        else{
            System.out.println("Too young to vote");
        }
    }
}
