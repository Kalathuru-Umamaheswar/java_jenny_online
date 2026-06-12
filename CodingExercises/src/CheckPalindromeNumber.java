import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = sc.nextInt();
        int OriginalNumber = num;
        int reversedNumber =0;
        /*for(;num != 0;num /= 10){
            int remainder = num % 10;
            reversedNumber = reversedNumber * 10 + remainder;
        }*/
        while(num!=0){
            int remainder=num%10;
            reversedNumber=reversedNumber*10+remainder;
            num=num/10;
        }
        if(OriginalNumber == reversedNumber){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
