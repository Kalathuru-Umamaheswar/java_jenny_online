import java.util.Scanner;

public class SumOfnNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int num = sc.nextInt();
        int sum=0;
        if(num<=0){ //Natural numbers starts from one
            System.out.println("Invalid Number");
        }
        else{
            for(int i=1;i<=num;i++){
                sum += i;
            }
        }
        System.out.println("Sum of "+num+"natural numbers is "+sum);
    }
}
