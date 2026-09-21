package CodingExercises.com;

import java.util.Scanner;

public class StudentGradeWithSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of a student : ");
        int marks=sc.nextInt();
        if(marks<0 || marks>100){
            System.out.println("Invalid marks.");
        }
        else{
            String grade = switch (marks/10){
                case 10,9 -> "A";
                    //System.out.println("A");
                    //break;
                case 8 -> "B";
                    //System.out.println("B");
                    //break;
                case 7 -> "C";
                    //System.out.println("C");
                    //break;
                case 6 -> "D";
                    //System.out.println("D");
                    //break;
                default -> "F";
                    //System.out.println("F");
            };
            System.out.println("You got "+grade+" grade");
        }
    }
}
