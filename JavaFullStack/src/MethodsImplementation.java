public class MethodsImplementation {
    public int method1(int a,int b,int c){
        return a+b+c;
    }
    public String method2(int a,String b,int c){
        return b;
    }
    public static boolean method3(int num){
        return num%2==0;
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        if(num%2==0){
            return true;
        }
        else{
            return false;
        }*/
    }

    public static void main(String[] args) {
        MethodsImplementation obj1=new MethodsImplementation();
        System.out.println(obj1.method1(10,20,30));
        System.out.println(obj1.method2(10,"returningString",20));
        System.out.println(obj1.method3(4));
    }

}
