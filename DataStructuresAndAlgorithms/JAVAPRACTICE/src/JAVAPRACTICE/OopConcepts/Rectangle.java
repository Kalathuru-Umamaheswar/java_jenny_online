package JAVAPRACTICE.OopConcepts;

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
    public int CalculateArea(){
        area=length*breadth;
        return area;
    }
    public void increaseLength(int byHowMuch){
        this.length+=byHowMuch;
    }
    public void decreaseBreadth(int byHowMuch){
        this.breadth-=byHowMuch;
    }
    void displayDetails(){
        System.out.println("Length :"+length);
        System.out.println("Breadth :"+breadth);
        System.out.println("Area :"+CalculateArea());
        show(this);
    }
    public void show(Rectangle obj){
        System.out.println("Method calling using object reference");
    }

}
