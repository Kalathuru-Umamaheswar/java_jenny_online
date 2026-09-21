import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        //Program that assigns letter grades based on numerical scores
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks :");
        int marks = sc.nextInt();
        if(marks>=90 && marks<=100){
            System.out.println("Grade A");
        }
        else if(marks>=80 && marks<=89){
            System.out.println("Grade B");
        }
        else if(marks>=70 && marks<=79){
            System.out.println("Grade C");
        }
        else if(marks>=60 && marks<=69){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }*/
        //Program to check number is positive,negative or zero
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        if(num>0){
            System.out.println("Positive Number");
        }
        else if(num == 0){
            System.out.println("Zero");
        }
        else{
            System.out.println("Negative Number");
        } */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Addition \n Enter 2 for Subtraction \n Enter 3 for Multiplication \n Enter 4 for division \n Enter 5 for modulo");
        System.out.println("Enter choice :");
        int choice = sc.nextInt();
        if(choice<1 || choice>5){
            System.out.println("You entered Invalid choice");
        }
        else{
            System.out.println("Enter First Number :");
            int num1 = sc.nextInt();
            System.out.println("Enter Second Number :");
            int num2 = sc.nextInt();
            if(choice==1){
                int sum = num1+num2;
                System.out.println("Addition :"+sum);
            }
            else if(choice == 2){
                int sub = num1-num2;
                System.out.println("Subtraction :"+sub);
            }
            else if(choice == 3){
                int mul = num1*num2;
                System.out.println("Multiplication :"+mul);
            }
            else if(choice == 4){
                int div = num1/num2;
                System.out.println("Division :"+div);
            }
            else if(choice == 5){
                int mod = num1 % num2;
                System.out.println("Modulus :"+mod);
            }
            else{
                System.out.println("You entered Invalid choice");
            }
        }
    }
}
