package com.jennylectures.oopconcepts;

public class RectangleTestDrive {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.setLength(12).setBreadth(3).display();
        obj.increaseLength(10).display();
        obj.decreaseBreadth(4);
        obj.display();

       /* int newLengthObj1=obj.getLength();
        newLengthObj1 += 10;
        obj.setLength(newLengthObj1).display();*/

//        System.out.println(obj.getBreadth());
//        System.out.println(obj.getLength());
//        System.out.println(obj.areaOfRectangle());


        //Rectangle obj=new Rectangle();
        //obj.setLength(2).setBreadth(4).displaydetails();

//        obj.setLength(3).displaydetails();
//        obj.setBreadth(5);
//        System.out.println(obj.getLength());
//        System.out.println(obj.getBreadth());
//        System.out.println(obj.areaOfRectangle());

    }

}
