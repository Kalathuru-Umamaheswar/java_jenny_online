package com.jennylectures.oopconcepts;

public class Rectangle {
    private int length;
    private int breadth;
    private int area;
    public Rectangle setLength(int length){
        this.length=length;
        return this;
    }
    public int getLength(){
        return length;
    }
    public Rectangle setBreadth(int breadth){
        this.breadth=breadth;
        return this;
    }
    public int getBreadth(){
        return breadth;
    }
    public int areaOfRectangle(){
        area=length*breadth;
        return area;
    }
    public Rectangle increaseLength(int byHowMuch){
        this.length += byHowMuch;
        return this;
    }
    /*public void increaseLength(int byHowMuch){
        this.length += byHowMuch;
    }*/

    /*public Rectangle decreaseBreadth(int byHowMuch){
        this.breadth -= byHowMuch;
        return this;
    }*/
    public void decreaseBreadth(int byHowMuch){
        if(this.breadth-byHowMuch>0) {
            this.breadth -= byHowMuch;
        }
    }

    public void display(){
        System.out.println("Length :"+length);
        System.out.println("Breadth :"+breadth);
        System.out.println("Area :"+areaOfRectangle());
    }


    /*private int length;
    private int breadth;
    private int area;
    public Rectangle setLength(int length){
        this.length=length;
        return this;
    }
    public int getLength(){
        return length;
    }
    public Rectangle setBreadth(int breadth){
        this.breadth=breadth;
        return this;
    }
    public int getBreadth(){
        return breadth;
    }
    public int areaOfRectangle(){
        area=length*breadth;
        return area;
    }
    public void displaydetails(){
        System.out.println("Length "+length);
        System.out.println("Breadth "+breadth);
        System.out.println("Area "+areaOfRectangle());
        show(this);
    }
    public void show(Rectangle obj){
        System.out.println("Method calling using object reference");
    } */
}
