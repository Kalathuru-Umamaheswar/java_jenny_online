import java.util.Scanner;

public class StudentGradeWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks :");
        int marks = sc.nextInt();
        if(marks<0 || marks>100){
            System.out.println("Invalid Marks");
        }
        else{
            String grade = switch (marks/10){
                case 10,9->{
                        System.out.println("Your marks are :"+marks);
                        yield "A";
                }

                    //System.out.println("A");
                case 8-> "B"; //This single expression is converted into {yield "B"}
                    //System.out.println("B");
                case 7-> "C";
                    //System.out.println("C");
                case 6-> "D";
                    //System.out.println("D");
                default-> "F";
                    //System.out.println("F");
            };
            System.out.println(grade);
        }
    }
}
