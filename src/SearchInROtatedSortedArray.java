public class SearchInROtatedSortedArray {
    /*static int searchInROtatedSortedArray(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            if (arr[low] <= arr[mid]) { // left part is sorted
                if (x >= arr[low] && x <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { //Right part is sorted
                if (x >= arr[mid] && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1; //element is not found in the array
    }*/
    static boolean searchInROtatedSortedArray(int[] arr,int x) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return true;
            }
            if(arr[low]==arr[mid] && arr[mid]==arr[high]){
                low=low+1;
                high=high+1;
                continue;
            }
            if (arr[low] <= arr[mid]) { // left part is sorted
                if (x >= arr[low] && x <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else { //Right part is sorted
                if (x >= arr[mid] && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,8,1,2,3,3,3};
        int target = 3 ;
        System.out.println(searchInROtatedSortedArray(arr, target));
    }
}
