import java.util.Arrays;

public class LeetCodeTwoSumProblem {
    static int[] twoSum(int[] yourArray,int num){
        int[] resultArray=new int[2];
        for(int i=0;i<yourArray.length;i++){
            for(int j=i+1;j<yourArray.length;j++){
                if(num==yourArray[i]+yourArray[j]){
                    resultArray=new int[]{i,j};
                    return resultArray;
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        int[] myArray={2,7,12,14};
        int target=26;
        System.out.println(Arrays.toString(twoSum(myArray,target)));
    }
}
