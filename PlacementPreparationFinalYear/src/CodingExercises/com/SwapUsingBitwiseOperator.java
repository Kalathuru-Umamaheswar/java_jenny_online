package CodingExercises.com;

public class SwapUsingBitwiseOperator {
    public static void main(String[] args) {
        int a=10,b=20;
        System.out.println("Before swapping the values of a and b are : "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping the values of a and b are : "+a+" "+b);
    }
}
