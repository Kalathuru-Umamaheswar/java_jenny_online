import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int t1=0,t2=1;
        if(num<=0){
            System.out.println("Invalid number");
        }
        else if(num==1){
            System.out.println(t1);
        }
        else{
            System.out.print(t1+" "+t2);
            for(int i=3;i<=num;i++){
                int nextTerm=t1+t2;
                System.out.print(" "+nextTerm);
                t1=t2;
                t2=nextTerm;
            }
        }
    }
}
