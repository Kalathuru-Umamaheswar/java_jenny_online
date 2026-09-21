package CodingExercises.com;

import java.util.Scanner;

public class StarPatternPrinting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int n=sc.nextInt();
        //pattern1
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */
        //pattern2
        /*
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern3
        /*
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
         */
        //pattern4
        /*
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern5
        /*
        //upperhalf
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //LowerHalf
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        /*
        for(int i=1;i<=2*n-1;i++){
            int stars=i;
            if(i>n){
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
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern7
        /*
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=11-2*i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern8
        /*
        for(int i=1;i<=2*n-1;i++){
            int space=i;
            int star=2*i-1;
            if(i<=n){
                space=n-i;
                star=2*i-1;
            }
            else{
                space=i-n;
                star=2*(2*n-i)-1;
            }
            //space
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern9
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
        //pattern10
        /*
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==n||j==1|i==j){
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
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        */
        //pattern13
        /*
        for(int i=1;i<=2*n-1;i++){
            int star=i;
            int space=i;
            if(i<=n){
                space=n-i;
                star=i;

            }
            else{   //i>n
                space=i-n;
                star=2*n-i;
            }
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */
        //pattern14
        for(int i=1;i<=2*n-1;i++){
            int star;
            int space=2*n-2;
            if(i<n){
                star=i;
                space-=2;
            }
            else{
                star=2*n-i;
                space+=2;
            }

            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
