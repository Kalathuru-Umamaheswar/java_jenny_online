public class FindIndexOfTargetElementUsingLS {
    public static void main(String[] args) {
        int[] arr={45,34,76,23,89};
        int target=34;
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        if(index!=-1){
            System.out.println("element found at "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
}
