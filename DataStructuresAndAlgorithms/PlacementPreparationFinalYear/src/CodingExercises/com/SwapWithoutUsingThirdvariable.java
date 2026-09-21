package CodingExercises.com;

public class SwapWithoutUsingThirdvariable {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before swapping the values of a and b are : "+a+" "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After swapping the values of a and b are : "+a+" "+b);
    }
}
