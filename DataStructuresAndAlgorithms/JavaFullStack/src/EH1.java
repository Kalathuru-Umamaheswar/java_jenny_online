public class EH1 {
    public static void main(String[] args) {
        try{
            int arr[]={10,20};
            try{
                System.out.println(10/0);
            }catch(Exception e){
                System.out.println("Inner catch block");
                System.out.println();
                e.printStackTrace();
            }
            System.out.println(arr[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Outer catch block");
            e.printStackTrace();
        }
    }
}
