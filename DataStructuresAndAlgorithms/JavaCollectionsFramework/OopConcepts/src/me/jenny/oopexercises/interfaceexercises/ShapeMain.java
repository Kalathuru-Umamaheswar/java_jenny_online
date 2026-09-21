package me.jenny.oopexercises.interfaceexercises;

//import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Choose the shape to calculate area :");
        System.out.println("1.Rectangle");
        System.out.println("2.Circle");
        System.out.println("3.Triangle");
        int choice=sc.nextInt();
        Shape shape;
        switch (choice) {
            case 1:
                System.out.println("Enter the length :");
                double length = sc.nextDouble();
                System.out.println("Enter the breadth :");
                double breadth = sc.nextDouble();
                shape = new Rectangle(length, breadth);
                break;
            case 2:
                System.out.println("Enter radius :");
                double radius = sc.nextDouble();
                shape = new Circle(radius);
                break;
            case 3:
                System.out.println("Enter the base of triangle :");
                double base = sc.nextDouble();
                System.out.println("Enter the height of the triangle :");
                double height = sc.nextDouble();
                shape = new Triangle(base, height);
                break;
            default:
                System.out.println("Invalid choice entered");
                return;
        }
        double area=shape.calculateArea();
        System.out.println("The area is :"+area);
    }
}
