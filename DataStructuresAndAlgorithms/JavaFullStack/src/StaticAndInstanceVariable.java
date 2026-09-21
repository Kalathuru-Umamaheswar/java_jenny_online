public class StaticAndInstanceVariable {
    static int a = 10;
    int b=20; //Instance Variable
    public static void main(String[] args) {
        System.out.println(StaticAndInstanceVariable.a);
        StaticAndInstanceVariable obj=new StaticAndInstanceVariable();
        System.out.println(obj.b);
    }
}
