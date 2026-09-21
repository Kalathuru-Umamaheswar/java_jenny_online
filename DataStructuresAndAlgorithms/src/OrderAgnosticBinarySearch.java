public class OrderAgnosticBinarySearch {
    static int OrderAgnosticBinarySearch(int[] arr,int key){
        int low=0;
        int high=arr.length-1;
        boolean isAscending=false;
        if(arr[low]<arr[high]){
            isAscending=true;
        }
        while (low<=high){
            int mid = low + (high-low)/2;
            if(key == arr[mid]){
                return mid;
            }
            if(isAscending){
                if(key>arr[mid]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            else{  //Elements are in Descending order
                if(key>arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {23, 34, 45, 56, 67, 78, 89};
        //int arr1[] = {89,78,67,56,45,34,23};
        int key = 45;
        int result = OrderAgnosticBinarySearch(arr, key);
        if (result != -1) {
            System.out.println("ELement found at " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
