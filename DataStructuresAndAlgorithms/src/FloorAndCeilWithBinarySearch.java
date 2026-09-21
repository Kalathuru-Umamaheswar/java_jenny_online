public class FloorAndCeilWithBinarySearch {
    static int findFloor(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int floor=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return arr[mid];
            }
            else if(arr[mid]<x){
                floor=arr[mid];
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return floor;
    }
    static int findCeil(int[] arr,int x){
        int low=0;
        int high=arr.length-1;
        int ceil=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==x){
                return arr[mid];
            }
            else if(arr[mid]>x){
                ceil=arr[mid];
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
        int[] arr={2,5,10,11,15,17,17,20};
        int num=8;
        System.out.println(findFloor(arr,num));
        System.out.println(findCeil(arr,num));
    }
}
