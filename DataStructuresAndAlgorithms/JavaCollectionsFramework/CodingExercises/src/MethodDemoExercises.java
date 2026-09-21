public class MethodDemoExercises {
    static void printMultiplicationTable(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
    static void isPrime(int num){
        if(num<=1){
            System.out.println(num+" is not a prime number");
            return;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                System.out.println(num+" is not a prime number");
                return;
            }
        }
        System.out.println(num+" is a prime number");
    }
    static void CalculateAreaCircumference(double radius){
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        System.out.println("Area :"+area);
        System.out.println("Circumference :"+circumference);
    }
    static void greet(String name,String timeOfDay){
        System.out.println("Hello "+name+" Good "+timeOfDay);
    }
    static double calculatePrice(int quantity,double price,boolean isMember){
        double totalPrice = quantity * price;
        if(isMember){
            totalPrice -= 0.15;
        }
        return totalPrice;
    }
    static boolean isEligibleToVote(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
    static void displayStudentGrade(String name,char grade){
        System.out.println(name+" got "+grade+" grade");
    }
    static char calculateGrade(int score){
        if(score>=90 && score<=100){
            return 'A';
        }
        else if(score>=80 && score<=89){
            return 'B';
        }
        else if(score>=70 && score<=79){
            return 'c';
        }
        else if(score>=60 && score<=69){
            return 'D';
        }
        else{
            return 'F';
        }
    }
    public static void main(String[] args) {
        char grade = calculateGrade(87);
        displayStudentGrade("ravi",grade);
        //System.out.println(isEligibleToVote(19));
        //System.out.println(calculatePrice(3,15,true));
        //greet("rajesh","Morning");
        //CalculateAreaCircumference(3.2);
//        isPrime(0);
//        isPrime(1);
//        isPrime(5);
//        isPrime(7);
//        isPrime(9);
        //Scanner sc=new Scanner(System.in);
        //System.out.println("ENter number :");
        //int num=sc.nextInt();
        //printMultiplicationTable(num);
    }
}
