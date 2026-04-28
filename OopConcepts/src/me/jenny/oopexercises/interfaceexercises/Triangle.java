package me.jenny.oopexercises.interfaceexercises;

public class Triangle implements Shape {
    public double base;
    public double height;
    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }
    public double calculateArea(){
        return 0.5*base*height;
    }

}
