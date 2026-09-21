package com.jennyslectures;

public class Library implements BooksOperations{
    private Book[] books=new Book[10];
    int bookCount=0;

    public void addBook(Book book){
        if(bookCount<books.length){
            books[bookCount]=book;
            bookCount++;
            System.out.println("Books has been added"+book);
        }
        else{
            System.out.println("Library is full. You cannot add more books");
        }
    }
    public void removeBook(String itemId){
        for(int i=0;i<bookCount;i++){
            if(books[i].getItemId().equals(itemId)){
                books[i]=books[--bookCount];
            }
        }
    }

}
