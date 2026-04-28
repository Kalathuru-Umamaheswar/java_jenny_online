package com.jennylectures.oopconcepts;

public class ConstructorIntro {
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNo;

    //Constructor Overloading
    //Constructor Chaining
    public ConstructorIntro(){
        this("836gd37j","Umesh",23.2,123456789L);
        System.out.println("No argument constructor is being called");
//        this.accountNumber="836gd37j";
//        this.accountName="Umesh";
//        this.balance=23.2;
//        this.phoneNo=123456789L;
    }
    public ConstructorIntro(String accountNumber,String accountName,double balance,long phoneNo){
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.balance=balance;
        this.phoneNo=phoneNo;
        System.out.println("Parameterized constructor is being called with 4 arguments");
    }
    public ConstructorIntro(String accountNumber,String accountName,double balance){
        this(accountNumber,accountName,balance,987654321L);
        System.out.println("Parameterized constructor is being called with 3 arguments");
//      this.accountNumber=accountNumber;
//        this.accountName=accountName;
//        this.balance=balance;
   }

    public void displaydetails(){
        System.out.println("Acccount holder name :"+this.accountName);
        System.out.println("Account Number :"+this.accountNumber);
        System.out.println("Current Balance :"+this.balance);
        System.out.println("Phone No :"+this.phoneNo);
    }

    /*
    private String accountNumber;
    private String accountName;
    private double balance;
    private long phoneNo;

//    public ConstructorIntro(){
//        this.accountName="Unknown";
//        this.accountNumber="Unknown";
//        this.balance=0.0;
//        this.phoneNo=12344567889L;
//    }
    public ConstructorIntro(String accountNumber,String accountName,double balance,long phoneNo){
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.balance=balance;
        this.phoneNo=phoneNo;
    }

    public void displaydetails(){
        System.out.println("Acccount holder name :"+this.accountName);
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
