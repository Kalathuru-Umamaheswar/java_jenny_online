public class BinarySearchAlgorithm {
    //Binary Search Using Recursive Approach
    static int BinarySearch(int[] arr,int key,int low,int high){
        if(low>high) return -1; //Base Case
        int mid=low+(high-low)/2;
        if(arr[mid]==key) return mid;
        else if(arr[mid]>key){
            return BinarySearch(arr,key,low,mid-1);
        }
        else {
            return BinarySearch(arr,key,mid+1,high);
        }
    }
    //Binary Search using Iterative Approach
   /* static int BinarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                //high = mid - 1; //Ascending order
                low = mid+1;
            } else {
                //low = mid + 1;
                high = mid-1;
            }
        }
        return -1;
    } */
        public static void main (String[] args){
            int arr[] = {23, 34, 45, 56, 67, 78, 89};
            //int[] arr = {89,78,67,56,45,34,23};
            int key = 45 ;
            int low=0;
            int high=arr.length-1;
            int result = BinarySearch(arr,key,low,high);
            if (result != -1) {
                System.out.println("Element found at " + result);
            } else {
                System.out.println("Element not found");
            }

        }
    }


