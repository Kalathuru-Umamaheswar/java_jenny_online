import java.util.Scanner;

public class CheckPasswordUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "P@ssword1111$";
        String enteredPassword;
        do{
            System.out.println("Enter your password :");
            enteredPassword = sc.nextLine();
            if(!(enteredPassword.equals(correctPassword)))
            {
                System.out.println("Invalid password. Try again");
            }
        }while(!(enteredPassword.equals(correctPassword)));
        System.out.println("Access Granted");
    }
}
