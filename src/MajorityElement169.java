public class MajorityElement169 {
    /*static int findMajorityElement(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            int majorityElement = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (majorityElement == nums[j]) {
                    count++;
                }
            }
            if (count > nums.length / 2) {
                return majorityElement;
            }
        }
        return -1;
    } */
    static int findMajorityElementMooreVoting(int[] nums){
        int majorityElement=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count == 0){
                majorityElement=nums[i];
            }
            if(majorityElement==nums[i]){
                count++;
            }
            else{ //majorityElement!=nums[i]
                count--;
            }
        }
        return majorityElement;
    }
    public static void main(String[] args) {
        int[] nums={2,2,3,3,2,2,2,1,1,1,1,1,1,1,1};
        //int result=findMajorityElement(nums);
        int result=findMajorityElementMooreVoting(nums);
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(result==nums[i]){
                c++;
            }
        }
        if(c>(nums.length)/2){
            System.out.println(result);
        }
        else{
            System.out.println("No majority element exist");
        }
        /*if(result!=-1){
            System.out.println(result);
        }
        else{
            System.out.println("No majority element exist");
        } */
    }
}
