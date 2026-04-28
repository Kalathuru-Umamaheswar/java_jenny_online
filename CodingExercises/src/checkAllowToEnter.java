import java.util.Scanner;

public class checkAllowToEnter {
    public static void main(String[] args) {
        int age;
        boolean hasTicket,isInvitedByVIP;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your age :");
        age = sc.nextInt();
        System.out.println("Are you having ticket (True or False)");
        hasTicket = sc.nextBoolean();
        System.out.println("Are you invited by VIP (True or False)");
        isInvitedByVIP = sc.nextBoolean();
        if(age >= 18 && (hasTicket || isInvitedByVIP))
        {
            System.out.println("You can enter into the field");
        }
        else{
            System.out.println("You canot enter into the field");
        }
    }
}
