import java.util.Scanner;

public class CalculatorUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("Welcome to the Calculator");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulo");
            System.out.println("6.Exit");
            System.out.println("Enter your choice (1-6) :");
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter two numbers :");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println("The addition of "+num1+" and "+num2+"is "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Enter two numbers :");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("The subtraction of "+num1+" and "+num2+"is "+(num1-num2));
                    break;
                case 3:
                    System.out.println("Enter two numbers :");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("The multiplication of "+num1+" and "+num2+"is "+(num1*num2));
                    break;
                case 4:
                    System.out.println("Enter two numbers :");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    if(num2 == 0){
                        System.out.println("Dividing by zero is undefined");
                    }
                    else {
                        System.out.println("The division of " + num1 + " and " + num2 + "is " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Enter two numbers :");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("The modulus of "+num1+" and "+num2+"is "+(num1%num2));
                    break;
                case 6:
                    System.out.println("Exiting the calculator");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while(choice != 6);
    }
}
