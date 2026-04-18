public class FloorAndCeilWithLinearSearch {
    //static int findCeil(int[] arr,int x) {
        /*int floor=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=x){
                floor=arr[i];
            }
            else{
                break;
            }
        }
        return floor;
    } */
        /*int ceil = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= x) {
                ceil = arr[i];
                break;
            }
        }
        return ceil;
    } */
    static void findFloorAndCeil(int[] arr,int x){
        int floor=-1,ceil=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                floor=arr[i];
                ceil=arr[i];
                break;
            }
            else if(arr[i]<x){
                floor=arr[i];
            }
            else{
                ceil=arr[i];
                break;
            }
        }
        System.out.println("Floor of "+x+" is "+floor);
        System.out.println("Ceil of "+x+" is "+ceil);
    }
    public static void main(String[] args) {
        int[] arr={2,5,10,11,15,17,17,20};
        int num=18;
        findFloorAndCeil(arr,num);
        //int f=findFloor(arr,num);
        //int c=findCeil(arr,num);
        /*if(c != -1){
            System.out.println("Floor of "+num+" is "+c);
        }
        else{
            System.out.println("None");
        } */
    }
}
