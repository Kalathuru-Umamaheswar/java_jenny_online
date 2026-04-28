import java.util.Scanner;

public class CountDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int OriginalNumber = num;
        int count =0;
        if (num == 0) {
            count=1;
        }
        else {
            for (; num != 0; num /= 10) {

                count++;
            }
        }
        System.out.println(OriginalNumber+" has "+count+" digits");
    }
}
