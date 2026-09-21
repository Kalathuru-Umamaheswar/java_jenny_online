import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bal=5000;
        System.out.println("Enter amt to withdraw ");
        int amt=sc.nextInt();
        sc.close();
        if(amt<=bal){
            System.out.println("withdraw successfully");
        }
        else{
            try{
                throw new InSufficientBalanceException("Insufficient balance");
            }
            catch(InSufficientBalanceException e){
                System.out.println(e.getMsg());
            }
        }
    }
}
