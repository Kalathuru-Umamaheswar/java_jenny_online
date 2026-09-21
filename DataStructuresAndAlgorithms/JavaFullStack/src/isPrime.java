public class isPrime {
    public static void main(String[] args) {
        int num=23;
        boolean Prime=true;
        for(int i=2;i<num;i++){
            if(num%i==0){
                Prime=false;
                break;
            }
        }
        if(Prime){
            System.out.println(num+ " is a prime number");
        }
        else{
            System.out.println(num+" is not a prime number");
        }
    }
}
