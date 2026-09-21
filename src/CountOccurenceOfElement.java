public class CountOccurenceOfElement {
    static int countOccurence(int[] arr,int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,6};
        int target=2;
        int result=countOccurence(arr,target);
        System.out.println(result);
    }
}
