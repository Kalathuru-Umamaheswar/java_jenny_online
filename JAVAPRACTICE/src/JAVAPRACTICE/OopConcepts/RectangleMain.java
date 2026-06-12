package JAVAPRACTICE.OopConcepts;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.setLength(4).setBreadth(5).displayDetails();
        obj.increaseLength(2);
        obj.decreaseBreadth(2);
        obj.displayDetails();
        //System.out.println(obj.getLength());
        //obj.setBreadth(5);
        //System.out.println(obj.getBreadth());
        //System.out.println(obj.CalculateArea());
        //obj.displayDetails();
    }
}
