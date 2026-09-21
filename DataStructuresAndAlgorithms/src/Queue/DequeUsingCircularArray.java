package Queue;

/*public class DequeUsingCircularArray {
    int[] deque;
    int front,rear;
    int size;
    public DequeUsingCircularArray(int size){
        this.size=size;
        this.deque=new int[size];
        this.front=-1;
        this.rear=-1;
        System.out.println("Deque has been created of size :"+size);
    }
    void addFront(int x){
        if(isFull()){
            System.out.println("Cannot add because deque is full.");
        }
        if(front==-1){
            front=0;
            rear=0;
            //deque[front]=x;
        }
        else if(front==0){
            front=size-1;
            //deque[front]=x;
        }
        else{
            front--;
            //deque[front]=x;
        }
        deque[front]=x;
    }
    void addRear(int x){
        if(isFull()){
            System.out.println("Cannot add because deque is full.");
        }
        else if(rear==size-1){
            return=0;
        }
        else{
            return++;
        }
        deque[]
    }
    boolean isFull(){
        return (front==0 && rear==size-1) || (rear+1==front);
    }
    boolean isEmpty(){
        return front==-1;
    }
    void display(){
        if(isEmpty()){
            System.out.println("Cannot display because deque is Empty.");
        }
        int i=front;
        while(i!=rear){
            System.out.println(deque[i]+" ");
            i=(i+1)%size;
        }
        System.out.println(deque[rear]);
    }

    public static void main(String[] args) {

    }
} */
