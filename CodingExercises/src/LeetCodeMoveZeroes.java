import java.util.Arrays;

public class LeetCodeMoveZeroes {
    static void moveZero(int[] yourArray){
        int i=0;
        for(int j=0;j<yourArray.length;j++){
            if(yourArray[j] != 0){
                int temp=yourArray[j];
                yourArray[j]=yourArray[i];
                yourArray[i]=temp;
                i++;
            }
        }
        System.out.println(Arrays.toString(yourArray));
    }
    public static void main(String[] args) {
        int[] myArray={0,1,2,0,4,6};
        moveZero(myArray);
    }
}
