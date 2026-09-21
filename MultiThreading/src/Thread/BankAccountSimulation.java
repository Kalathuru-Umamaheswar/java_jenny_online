package Thread;

class BankAccount {
    private double accountBalance;
    private final Object lock = new Object();
    public synchronized double getBalance() {
        return accountBalance;
    }

    BankAccount(double balance) {
        this.accountBalance = balance;
    }

    void deposit(double amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        synchronized (lock) {
            double original = accountBalance;
            accountBalance += amount;
            System.out.println("Starting Balance :" + original + " deposit: " + amount + " New balance: " + accountBalance);
        }
    }

    void withdraw(double amount) {
        System.out.println(Thread.currentThread().getName() + " is withdrawing...");

        if (accountBalance >= amount) {
            try {

                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            synchronized (lock) {
                double original = accountBalance;
                accountBalance -= amount;
                System.out.println("Starting Balance :" + original + " withdraw: " + amount + " New balance: " + accountBalance);
            }
        } else {
            System.out.println("Insufficient funds");
        }

    }
}
    public class BankAccountSimulation{
        public static void main(String[] args) {
            BankAccount account=new BankAccount(10000);
            Runnable task1= () -> account.deposit(7000);
            Runnable task2= () -> account.withdraw(5000);
            Thread user1=new Thread(() -> account.withdraw(5000));
            Thread user2=new Thread(() -> account.deposit(7000));
            Thread user3=new Thread(() -> account.withdraw(5000));
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

