package me.jenny.oopexercises;

public class Book {
    private String title;
    private String author;
    private double price;
    public Book(){
        this("unknown","unknown");
        //this.title="unknown";
        //this.author="unknown";
        this.price=100.8;
        System.out.println("No args constructor called");
    }
    public Book(String title,String author){
        this(title,author,500.45);
        System.out.println("Parameterized constructor called with 2 arguments");
        //this.title=title;
        //this.author=author;
    }
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
        System.out.println("Parameterized constructor called with 3 arguments");
    }
    void displayDetails(){
        System.out.println("Title :"+this.title);
        System.out.println("Author :"+this.author);
        System.out.println("Price :"+this.price);
    }
}
