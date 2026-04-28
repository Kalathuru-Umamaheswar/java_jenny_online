import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight,height;
        System.out.println("Enter weight in KG :");
        weight = sc.nextDouble();
        System.out.println("Enter height in meters :");
        height = sc.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("Your BMI is :" + BMI);

    }
}
