package CodingExercises.com;

import java.util.Scanner;

public class NumberPatternPrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n=sc.nextInt();
        //pattern15
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */
        //pattern16
        /*
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        */
        //patern17
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
        */
        //pattern18
        /*
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        */
        //pattern19
        /*
        for(int i=1;i<=n;i++){
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //space
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        */
        //pattern20
        /*
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        */
        //pattern21
        /*
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=i;j<2*i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */
        //pattern22
        /*
        for(int i=n;i>=1;i--){
            //space
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            //numbers
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        */
        //pattern23
        /*
        for(int i=n;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        */
        //pattern24
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j%2==0)
                    System.out.print(0);
                else
                    System.out.print(1);
            }
            System.out.println();
        }
        */
        //pattern25
        /*
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        */
        //pattern27
        /*
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
         */
        //pattern28
        /*
        char ch='A';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            ch++;
            System.out.println();
        }
        */
        //pattern29
        /*
        for(int i=n;i>=1;i--){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
        */
        //pattern30
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //alphabets
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
