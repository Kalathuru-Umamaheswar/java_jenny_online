public class CheckedAndUncheckedExceptions {
    public static void display(){
        try {
            String str = null;
            System.out.println(str.length());
        }catch(NullPointerException npe){
            System.out.println(npe);;
        }
        System.out.println("End of display");
    }
    public static void greet(){
        display();
        System.out.println("End of Greet");
    }
    public static void main(String[] args) {
        greet();
        System.out.println("End of main");
        //FileReader file=new FileReader("myfile.txt");
      /*  try{
            FileReader file=new FileReader("myfile.txt");
        }catch (FileNotFoundException e){
            System.out.println("FIle not found. "+e);
        } */

        /*try {
            int result = 10 / 0;
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        }catch (ArithmeticException ae){
            System.out.println("Cannot divide by zero "+ae);
            ae.printStackTrace();
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Array index does not exist "+aiob);
        }
        catch (Exception e){
            System.out.println("Something else went wrong. "+e);
        }

        System.out.println("End of main"); */
    }
}
