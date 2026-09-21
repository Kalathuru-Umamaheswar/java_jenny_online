public class ThrowingException {
/*static void areaOfCylinder(int radius,int height) {
    try {
        double p = perimeter(radius);
        System.out.println("Area of Cylinder is: " + (p * (height + radius)));
    }catch (Exception e){
        System.out.println(e.getMessage());
    }
}
static double perimeter(int radius) throws Exception{
    if(radius<0){
        throw new IllegalArgumentException("radius cannot be negative");
    }
    return 2 * Math.PI*radius;
}
    public static void main(String[] args) {
        int radius=2,height=6;
        areaOfCylinder(radius,height);
    } */
    static void method1() throws Exception {
        method2();
        System.out.println("End of method1");
    }
    static void method2() throws Exception {
        //FileReader file=new FileReader("myfile.txt");
        int a = 5, b = 0;
        if (b == 0) {
            //throw new ArithmeticException("b cannot be zero");
            throw new Exception("b cannot be zero");
        }
        System.out.println(a / b);
        System.out.println("End of method 2");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("End of main");
    }
}
