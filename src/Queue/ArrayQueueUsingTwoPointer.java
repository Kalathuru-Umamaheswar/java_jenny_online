package Queue;

public class ArrayQueueUsingTwoPointer {
    private int[] queue;
    private int rear,front;
    public ArrayQueueUsingTwoPointer(int size){
        front=-1;
        rear=-1;
        this.queue=new int[size];
        System.out.println("Queue has been created of size : "+size);
    }
    public void enqueue(int x){
        if(isFull()){
            System.out.println("Cannot insert because queue is full.");
            return;
        }
        rear++;
        queue[rear]=x;
        if(front==-1){
            front++;
        }
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty so cannot delete.");
            return -1;
        }
        if(front==rear){
            int removedElement=queue[front];
            front=-1;
            rear=-1;
            return removedElement;
        }
        int removedElement=queue[front];
        front++;
        return removedElement;
    }
    public int front(){
        if(isEmpty()){
            System.out.println("Queue is empty so cannot delete.");
            return -1;
        }
        return queue[front];
    }
    public boolean isFull(){
        return rear==queue.length-1;
    }
    public boolean isEmpty(){
        return rear==-1 || front>rear;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty so cannot delete.");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }
    public static void main(String[] args) {
        ArrayQueueUsingTwoPointer queue=new ArrayQueueUsingTwoPointer(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("\nFront element is : "+queue.front());
        System.out.println("Removed element is : "+queue.dequeue());
        queue.display();
        System.out.println("\nFront element is : "+queue.front());
    }
}
