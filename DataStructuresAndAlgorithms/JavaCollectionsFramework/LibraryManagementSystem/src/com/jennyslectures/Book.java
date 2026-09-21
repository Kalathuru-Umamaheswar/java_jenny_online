package com.jennyslectures;

public class Book extends LibraryItem{
    private Author author;

    public Book(String itemId,String title,Author author){
        super(itemId,title);
        this.author=author;
    }
    @Override
    public void showDetails(){
        System.out.println("Book Title: "+title+"\nAuthor Name:"+author.getAuthorName());
    }
}
