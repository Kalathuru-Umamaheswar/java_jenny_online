import java.util.Arrays;

public class RotateArray {
    static void reverseArray(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    static void rotateArray(int[] nums,int k){
        int n=nums.length;
        k=k%n;
        reverseArray(nums,0,n-1);
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=8;
        rotateArray(arr,k);
        System.out.println(Arrays.toString(arr));
    }

    /*static void RotateArray(int[] arr,int k){
        int n=arr.length;
        int[] temp=new int[n];
        for(int i=0;i<arr.length;i++){
            temp[(i+k)%n]=arr[i];
        }
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int k=3;
        RotateArray(arr,k);
        System.out.println(Arrays.toString(arr));
    } */
}
