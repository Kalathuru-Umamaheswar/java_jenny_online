package com.jennylectures.oopconcepts;

public class BankAccount {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNo;

    public void deposit(double howMuchMoney) {
        if (howMuchMoney > 0) {
            this.balance += howMuchMoney;
            System.out.println("Deposited Rs." + howMuchMoney + "\nCurrent balance Rs." + this.balance);
        }
        else{
            System.out.println("Invalid amount entered. Please try again");
        }
    }
    public void withdraw(double howMuchMoney) {
        if(howMuchMoney>=0) {
            if (this.balance - howMuchMoney >= 0) {
                this.balance -= howMuchMoney;
                System.out.println("Withdrawn Rs." + howMuchMoney + "\nRemaining balance Rs." + this.balance);
            }
            else {
                System.out.println("Insufficient funds. You have Rs." + this.balance);
            }
        }
        else{
            System.out.println("Invalid amount entered. Please try again");
        }
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }

    public void setAccountName(String accountName){
        this.accountName=accountName;
    }
    public String getAccountName(){
        return accountName;
    }

    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }

    public void setPhoneNo(long phoneNo){
        this.phoneNo=phoneNo;
    }
    public long getPhoneNo(){
        return phoneNo;
    }










    /*
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNo;

    public void deposit(int howMuchMoney) {
        if (howMuchMoney > 0) {
            this.balance += howMuchMoney;
            System.out.println("Deposited Rs. " + howMuchMoney + " \nCurrent balance is: " + this.balance);
        }
        else{
            System.out.println("Invalid amount entered");
        }
    }
    public void withdraw(int howMuchMoney){
        if(howMuchMoney>0) {
            if (this.balance - howMuchMoney > 0) {
                this.balance -= howMuchMoney;
                System.out.println("Withdrawn Rs " + howMuchMoney + " \nRemaining balane is:" + this.balance);
            } else {
                System.out.println("Insufficient Balance . You have Rs " + this.balance + " in your account");
            }
        }
        else{
            System.out.println("Invalid amount entered. Please try again");
        }
    }
    public void displaydetails(){
        System.out.println("Account holder name :"+this.accountName);
        System.out.println("Account Number :"+this.accountNumber);
        System.out.println("Current Balance :"+this.balance);
        System.out.println("Phone No :"+this.phoneNo);
    }
    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public void setAccountName(String accountName){
        this.accountName=accountName;
    }
    public String getAccountName(){
        return accountName;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setPhoneNo(long phoneNo){
        this.phoneNo=phoneNo;
    }
    public long getPhoneNo(){
        return phoneNo;
    } */
}
