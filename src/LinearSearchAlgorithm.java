import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchAlgorithm {
    static int linearSearch(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                if(i>0){
                    int temp=arr[i];
                    //arr[i]=arr[i+1];
                    arr[i]=arr[0];
                    //arr[i+1]=temp;
                    arr[0]=temp;
                    //return i+1;
                    return 0;
                }
                return i; //if i==0
            }
        }
        return -1; //Element not found in an array
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of array :");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter "+n+" elements :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter which element you want to search :");
        int key=sc.nextInt();
        int result=linearSearch(arr,key);
        System.out.println("Modofied array is :"+Arrays.toString(arr));  //Modified array
        if(result !=-1){
            System.out.println("Element found at "+result);
        }
        else{
            System.out.println("Element not found");
        }

    }
}
