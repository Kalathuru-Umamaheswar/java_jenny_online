package CodingExercises.com;

public class MethodDemoExercise {
    static void multiplicationTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    static void primeNumber(int n){
        boolean isPrime=true;
        if(n<=1){
            System.out.print(n+" is not a prime number");
            return;
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                isPrime=false;
                System.out.println(n+" is not a prime number");
            }
        }
        if(isPrime){
            System.out.println(n+" is a prime number");
        }
    }
    static void ACOfCircle(int radius){
        System.out.println("Area of circle is : "+ Math.PI*radius*radius);
        System.out.println("Circumference of a circle is : "+2*Math.PI*radius);
    }
    static void greet(String name,String timeOfDay){
        System.out.println("Hello "+name+" Good"+timeOfDay);
    }
    static double calculatePrice(int quantity,double price,boolean isMember){
        double totalPrice=quantity*price;
        if(isMember){
            totalPrice -= totalPrice * 0.15;
        }
        return totalPrice;
    }
    static boolean vote(int age){
        if(age>18)
            return true;
        return false;
    }
    static void displayStudentGrade(String name,char grade){
        System.out.println(name+" got "+grade+" grade");
    }
    static char calculateGrade(int score){
        if(score>=90 && score<=100)
            return 'A';
        else if(score>=80 && score<=89)
            return 'B';
        else if(score>=70 && score<=79)
            return 'C';
        else if(score>=60 && score<=69)
            return 'D';
        else
            return 'F';

    }


    public static void main(String[] args) {
        //multiplicationTable(4);
//        primeNumber(1);
//        primeNumber(2);
//        primeNumber(3);
//        primeNumber(4);
//        primeNumber(5);
//        primeNumber(6);
//        primeNumber(7);
//        primeNumber(8);
//        primeNumber(9);
//        primeNumber(10);
//        primeNumber(11);
        //ACOfCircle(5);
        //greet("ramu","Evening");
        //System.out.println(calculatePrice(3,45.6,true));
        //System.out.println(calculatePrice(3,45.6,false));
//        boolean result=vote(18);
//        System.out.println(result);
//        System.out.println(vote(23));
        ;
        //displayStudentGrade("Ravi",calculateGrade(86));
    }
}
