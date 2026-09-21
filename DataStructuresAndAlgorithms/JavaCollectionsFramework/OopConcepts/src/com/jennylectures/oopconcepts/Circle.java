package com.jennylectures.oopconcepts;

public class Circle {
    private double radius;
    public void setRadius(double radius){
        if(radius>=0) {
            this.radius = radius;
        }
        else{
            this.radius=1;
        }
    }
    public void display(){
        System.out.println("Area :"+this.getArea());
        System.out.println("Circumference :"+this.getCircumference());
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    }



    /*private double radius;
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        }
        else{
            this.radius=1;
        }
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getCircumference(){
        return 2*Math.PI*radius;
    } */
}
