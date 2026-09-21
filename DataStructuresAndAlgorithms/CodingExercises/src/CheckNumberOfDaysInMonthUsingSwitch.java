import java.util.Scanner;

public class CheckNumberOfDaysInMonthUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Month number(1-12) :");
        int monthNumber = sc.nextInt();
        int days=switch(monthNumber){
          case 1,3,5,7,8,10,12 -> 31;
          case 4,6,9,11-> 30;
          case 2->{
              System.out.println("Enter the year :");
              int year = sc.nextInt();
              if(year % 400 ==0 || (year % 4 == 0 && year % 100 != 0)){
                  yield 29;
              }
              else{
                  yield 28;
              }
          }
          default -> {
              System.out.println("Not a valid month number");
              yield -1;
          }
        };
        System.out.println(days);
    }
}
