public class CountEvenOddInArray {
    public static void main(String[] args) {
        int[] arr={23,24,34,35,45,46,47};
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("Even Count is :"+evenCount);
        System.out.println("Odd count is :"+oddCount);

    }
}
