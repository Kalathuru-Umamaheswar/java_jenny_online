package com.jennyslectures;

public class Magazine extends LibraryItem{
    private int issueNumber;
    public Magazine(String itemId,String title,int issueNumber){
        super(itemId,title);
        this.issueNumber=issueNumber;
    }
    @Override
    public void showDetails(){
        System.out.println("Magazine Id: "+itemId+"\nTitle:"+title+"\nIssue Number: "+issueNumber);
    }
}
