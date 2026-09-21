package com.jennyslectures;

public class Main {
    public static void main(String[] args) {
        //create Library items
        Author author=new Author("Kathy Sierra","Kathy Sierra is author of the series",3);

        Book book1=new Book("Java001","Head First Java",author);
        //Magazine m1=new Magazine("Mag001","AI Evolution",10);
        Library library=new Library();
        library.addBook(book1);
        //Create Users
        Student s1=new Student("235g5rf","Payal");
        Professor p1=new Professor("EMP001","Jenny");

        //Borrow items
        //s1.borrow(book1);

        //s1.showBorrowItem();



    }




}
