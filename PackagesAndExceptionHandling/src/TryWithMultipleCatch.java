public class TryWithMultipleCatch {
    public static void main(String[] args) {

       /* Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("ENter elements of array :");
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(sc.nextLine());
            }
            System.out.println("ENter the number :");
            int num=Integer.parseInt(sc.nextLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] / num; //5/0 if num=0
            }
            System.out.println("Printing array elements");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }
        catch(ArrayIndexOutOfBoundsException aiob){
            System.out.println(aiob);
        } */
        try {
            int result = 10 / 0;
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        }catch (ArithmeticException ae){
            System.out.println("Cannot divide by zero "+ae);
        }
        catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Array index does not exist "+aiob);
        }
        catch (Exception e){
            System.out.println("Something else went wrong. "+e);
        }
        System.out.println("End of Main");
    }
}
