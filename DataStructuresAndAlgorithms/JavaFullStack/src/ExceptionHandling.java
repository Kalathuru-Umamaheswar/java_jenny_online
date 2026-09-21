public class ExceptionHandling {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        try {
            System.out.println(arr[25]);
        }catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            //System.out.println("error message is displaying");
        }finally{
            System.out.println("finally block");
        }
        System.out.println("END");
    }
}
