import java.util.Scanner;

public class PrintNumbersInReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        for(int i=num;i>=1;i--){
            System.out.println(i);
        }
    }
}
