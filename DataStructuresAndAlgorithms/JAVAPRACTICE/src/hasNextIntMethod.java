/*
hasNextInt() is a method of the Scanner class.
It checks whether the next input value is an integer or not.
If the next value is an integer → returns true
Otherwise → returns false */
import java.util.Scanner;

public class hasNextIntMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter something :");
        if(sc.hasNextInt()){
            int num=sc.nextInt();
            System.out.println("Integer is : "+num);
        }
        else{
            System.out.println("Not an integer");
        }
    }
}
