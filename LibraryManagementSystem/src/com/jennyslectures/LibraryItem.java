package com.jennyslectures;

abstract public class LibraryItem {
    protected String itemId;
    protected String title;
    protected boolean isAvailable;

    public LibraryItem(String itemId,String title){  //Constructor
        this.itemId=itemId;
        this.title=title;
        isAvailable=true;
    }

    public boolean isAvailable(){
        return isAvailable;
    }
    public void borrowItem(){
        if(isAvailable){
            System.out.println(title+" borrowed succesfully");
            isAvailable=false;
        }
        else{
            System.out.println(title+" is not available");
        }
    }
    public void returnItem(){
        isAvailable=true;
        System.out.println(title+" returned succesfully");
    }
    abstract public void showDetails();
    /*{
        System.out.println("Id: "+itemId+"\nTitle: "+title+"\nAvailable: "+isAvailable);
    }*/

    public String getItemId() {
        return itemId;
    }
}
