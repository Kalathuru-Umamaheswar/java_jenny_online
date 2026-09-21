import java.util.Arrays;

public class FirstAndLastPosition {
    /*static int[] firstAndLAstPosition(int[] nums, int target) {
        int[] result = {-1, -1};
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) {
                if (result[0] == -1) {
                    result[0] = i;
                }
                result[1] = i;
            }
        }
        return result;
    } */
    static int firstPosition(int[] nums,int target){
        int low=0,high=nums.length-1;
        int first=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return first;
    }
    static int lastPosition(int[] nums,int target){
        int low=0,high=nums.length-1;
        int last=-1;
        while (low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return last;
    }

    static int[] firstAndLastPosition(int[] nums,int target){
        int[] result={-1,-1};
        int first=firstPosition(nums,target);
        if(first==-1){
            return new int[]{-1,-1};
        }
        return new int[]{first,lastPosition(nums,target)};
    }
    public static void main(String[] args) {
        int[] nums = {1, 3, 3, 3, 3, 3, 3, 3, 5, 7};
        int target = 3;
        int[] answer=firstAndLastPosition(nums,target);
        System.out.println(Arrays.toString(answer));
    }
}

