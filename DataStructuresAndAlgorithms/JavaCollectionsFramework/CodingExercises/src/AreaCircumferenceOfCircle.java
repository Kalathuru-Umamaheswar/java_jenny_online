import java.util.Scanner;

public class AreaCircumferenceOfCircle {
    public static void main(String[] args) {
        float radius;
        final double PI = 3.14d;
        System.out.println("Enter radius :");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
        double AreaOfCircle = PI * radius * radius;
        double CircumferenceOfCircle = 2 * PI * radius;
        System.out.println("Area of circle is :" + AreaOfCircle);
        System.out.println("Circumference of circle is :" + CircumferenceOfCircle);
    }
}
