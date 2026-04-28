import java.util.Scanner;

public class CoffeeOrderingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the coffee shop");
        double bill=0;
        int choice;
        System.out.println("1.Espresso");
        System.out.println("2.Cappuccino");
        System.out.println("3.Latte");
        System.out.println("Enter your choice :");
        choice = sc.nextInt();
        switch (choice){
            case 1: bill=200;break;
            case 2: bill = 250;break;
            case 3: bill = 300;break;
            default:
                System.out.println("Invalid choice");
        }
//        if(choice == 1){
//            bill=200;
//        }
//        else if(choice==2){
//            bill=250;
//        }
//        else if(choice == 3) {
//            bill=300;
//        }
//        else {
//            System.out.println("Invalid choice");
//        }
        if(bill>0){
            System.out.println("Add whipped cream for RS.30(yes=1/no=0)");
            int whippedCream = sc.nextInt();
            if(whippedCream == 1){
                bill += 30;
            }
            System.out.println("Add Flavour Shot");
            int flavourShot = sc.nextInt();
            if(flavourShot == 1){
                System.out.println("Which one (Enter 1 for vanilla & 2 for Hazelnut)");
                int flavourChoice = sc.nextInt();
                switch (flavourChoice){
                    case 1:bill+=20;break;
                    case 2:bill+=25;break;
                    default:
                        System.out.println("Invalid Flavour choice");
                }
//                if(flavourChoice == 1){
//                    bill += 20;
//                }
//                else if(flavourChoice == 2){
//                    bill += 25;
//                }
            }
            System.out.println("Total bill is :" + bill);
    }
    }
}
