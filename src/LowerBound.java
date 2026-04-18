public class LowerBound {
    static int lowerBound(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
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
        int result = lowerBound(arr,key);
        System.out.println("Lower Bound index of "+key+" is "+result);
    }
}
