public class RemoveElement27 {
    static int removeElement(int[] nums,int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,5,6,2};
        int val=2;
        int result=removeElement(arr,val);
        System.out.println(result);
    }
}
