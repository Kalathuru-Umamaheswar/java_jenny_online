public class PrintingMinMaxValueForCharTypeUsingWrapperClass {
    char myMinCharVariable=Character.MIN_VALUE;
    char myMaxCharVariable=Character.MAX_VALUE;
    int a=(int)myMinCharVariable;
    int b=(int)myMaxCharVariable;
    public static void main(String[] args) {
        PrintingMinMaxValueForCharTypeUsingWrapperClass obj=new PrintingMinMaxValueForCharTypeUsingWrapperClass();
        System.out.println("Minimum value = "+obj.a);
        System.out.println("Maximum value = "+obj.b);
    }
}
