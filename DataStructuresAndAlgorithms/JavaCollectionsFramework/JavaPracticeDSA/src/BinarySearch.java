public class BinarySearch {
    public static void main(String[] args) {
            //SubArray


        }
    }









    /*public static int peakElement(int[] arr){
        int n = arr.length;
        int i = 0,j = n-1;
        if(n == 1){
            return arr[0];
        }
        if(arr[n-2] < arr[n-1]){ // no decreasing phase
            return arr[n-1];
        }
        if(arr[0] > arr[1]){ // no increasing phase
            return arr[0];
        }
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return arr[mid];
            }
            if(arr[mid] < arr[mid+1]){ // increasing phase
                i = mid+1;
            }else{
                j = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {14,13,12,4,0,-1};
        System.out.println(peakElement(arr));
    } */

