import java.util.Arrays;

public class ReverseArray {
    static int[] reverseArray(int[] myArray){
        int rightIndex=myArray.length-1;
        int halfIndex=(myArray.length)/2;
        int leftIndex=0;
        while(leftIndex<rightIndex){
            int temp=myArray[rightIndex];
            myArray[rightIndex]=myArray[leftIndex];
            myArray[leftIndex]=temp;
            rightIndex--;
            leftIndex++;
        }
//        for(int i=0;i<halfIndex;i++){
//            int temp=myArray[rightIndex];
//            myArray[rightIndex]=myArray[i];
//            myArray[i]=temp;
//            rightIndex--;
//        }
        //System.out.println(Arrays.toString((myArray)));
        return myArray;
    }
    public static void main(String[] args) {
        int[] myArray={1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(myArray)));
//        int[] myArray={1,2,3,4,5};
//        for(int i=myArray.length-1;i>=0;i--){
//            System.out.print(myArray[i]+" ");
//        }
    }
}
