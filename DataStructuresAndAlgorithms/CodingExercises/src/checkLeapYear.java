import java.util.Scanner;

public class checkLeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter which year you want to check");
        year = sc.nextInt();
        if((year % 4 == 0 && year %100 != 0) || (year % 400 == 0)){
            System.out.println("It's a leap year");
        }
        else{
            System.out.println("It's not a leap year");
        }
    }
}
