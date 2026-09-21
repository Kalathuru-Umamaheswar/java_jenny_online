public class UpperBound {
    static int upperBound(int[] arr,int key) {
        int low = 0;
        int high = arr.length - 1;
        int ub = arr.length;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] > key) {
                ub = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ub;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{2,5,7,15,15,15,22,25,50};
        int key=15;
        int result = upperBound(arr,key);
        System.out.println("Upper Bound index of "+key+" is "+result);
    }
    }

