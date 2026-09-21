public class Blocks {
    int a,b,c;
    public Blocks(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public static void main(String[] args) {
        Blocks obj=new Blocks(10,20,30);
        System.out.println(obj.a);
    }
}
