package Thread;

class BankAccount {
    private double accountBalance;
    public double getBalance(){
        return accountBalance;
    }
    BankAccount(double balance){
        this.accountBalance=balance;
    }
    void deposit(double amount){
        System.out.println(Thread.currentThread().getName()+" is depositing...");
        try{
            Thread.sleep(500);
        }catch (InterruptedException e){
            System.out.println(e);
        }
        double original=accountBalance;
        accountBalance += amount;
        System.out.println("Starting Balance :"+original+" deposit: "+amount+" New balance: "+accountBalance);
    }
    void withdraw(double amount){
        System.out.println(Thread.currentThread().getName()+" is withdrawing...");
        double original=accountBalance;
        if(accountBalance>amount){
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }

            accountBalance -= amount;
            System.out.println("Starting Balance :"+original+" withdraw: "+amount+" New balance: "+accountBalance);
        }else{
            System.out.println("Starting Balance :"+original+" withdraw :"+amount+" Insufficient funds");
        }

    }
    public class BankAcccountSimulation{
        public static void main(String[] args) {
            BankAccount account=new BankAccount(1000);
            MyRunnable task1=new MyRunnable();
            MyRunnable task2=new MyRunnable();
            Thread user1=new Thread(task1);
            Thread user2=new Thread(task2);
            Thread user3=new Thread(task1);
            user1.start();
            user2.start();
            user3.start();
            try{
                user1.join();
                user2.join();
                user3.join();
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }

    }
}
