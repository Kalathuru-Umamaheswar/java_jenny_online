public class SearchInsertPosition {
    static int insertPosition(int[] arr,int key){
        int high=arr.length-1;
        int low=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=key){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,5,7,15,15,15,22,25,50};
        int key=15;
        int result = insertPosition(arr,key);
        System.out.println(result);
    }
}
