package com.jennyslectures;

public class User {
    protected String userId;
    protected String name;
    protected int maxBorrowLimit=1;
    private LibraryItem borrowedItem;
    public User(String userId, String name){
        this.userId=userId;
        this.name=name;
        this.borrowedItem=null;
    }

    public void borrow(LibraryItem item){
            if(borrowedItem!=null){
                System.out.println(name+" has already borrowed an Item. Return it first");
            }
            else if(item.isAvailable()){
                borrowedItem=item;
                item.borrowItem();
            }
    }
    public void returnItem(){
        if(borrowedItem==null){
            System.out.println(name+" has no borrowed item");
        }
        else {
            borrowedItem.returnItem();
            borrowedItem=null;
        }
    }
    public void showBorrowItem(){
        if(borrowedItem==null){
            System.out.println(name+" has no borrowed items");
        }
        else{
            System.out.println(name+" has borrowed :");
            borrowedItem.showDetails();
        }
    }
}
