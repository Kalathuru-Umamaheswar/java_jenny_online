package CodingExercises.com;

import java.util.Scanner;

public class PatternPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n = sc.nextInt();
        //pattern1
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //patten2
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern3
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern4
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern5
        /*
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(stars<n){
                stars=i;
            }
            else{
                stars=2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern6
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern7
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=11-2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern8
        /*
        for(int i=1;i<=2*n-1;i++){
            int stars=2*i-1;
            int space=i;
            if(i<=n){
                space=n-i;
                stars=2*i-1;
            }
            if(i>n){
                space=i-n;
                stars=2*(2*n-i)-1;
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern9
        /*
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
         //pattern10
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i==n || j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
         */
        //pattern11
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        //pattern12
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
    }
}
