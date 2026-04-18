package TreeDemo;

public class MaxHeap {
    int[] heapArr;
    int capacity;
    int size;
    MaxHeap(int capacity){
        this.capacity=capacity;
        heapArr=new int[capacity];
        size=0;
    }
    int parent(int i){
        return (i-1)/2;
    }
    void swap(int i,int j){
        int temp=heapArr[i];
        heapArr[i]=heapArr[j];
        heapArr[j]=temp;
    }
    void insert(int val){
        heapArr[size]=val;
        int i=size;
        size++;
        while (i!=0 && heapArr[i]>heapArr[parent(i)]){
            swap(i,parent(i));
            i=parent(i);
        }
    }
    void display(){
        for(int i=0;i<size;i++){
            System.out.print(heapArr[i]+" ");
        }
    }
    public static void main(String[] args) {
        MaxHeap obj=new MaxHeap(10);
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(7);
        obj.display();
    }
}
