public class swapUsingBitwiseOperator {
    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println("Before swapping the values of a and b are : "+a+" "+b);
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("After swapping the values of a and b are : "+a+" "+b);
    }
}
