import java.util.Scanner;

public class checkEligibleToVote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Are you citizen of this country (True or False)");
        boolean isCitizen = sc.nextBoolean();
        if(age>=18 && isCitizen){
            System.out.println("You are eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}
