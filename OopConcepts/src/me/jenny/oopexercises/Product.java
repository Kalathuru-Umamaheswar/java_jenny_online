package me.jenny.oopexercises;

public class Product {
    private String productName;
    private String productID;
    private double price;
    private int discount;

    public Product(){
        this("unknown","unknown",0.0,0);
        //this.productName="unknown";
        //this.productID="unknown";
        //this.price=0.0;
        //this.discount=0;
    }
    public Product(String productName,String productID){
        this(productName,productID,23.45,10);
        //this.productName=productName;
        //this.productID=productID;
        System.out.println("Parameterized constructor called with 2 arguments");
    }
    public Product(String productName,String productID,double price,int discount){
        this.productName=productName;
        this.productID=productID;
        this.price=price;
        this.discount=discount;
        System.out.println("Parameterized constructor called with 4 arguments");
    }
    public double calculateDiscountedPrice(){
        return price=(price*discount/100);
    }
    public void displayDetails(){
        System.out.println("Product Name :"+this.productName);
        System.out.println("Product Id :"+this.productID);
        System.out.println("Price :"+this.price);
        System.out.println("Discount :"+this.discount);
        System.out.println("Discounted Price : Rs "+this.calculateDiscountedPrice());
    }
}
