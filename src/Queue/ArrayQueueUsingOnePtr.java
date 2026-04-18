package Queue;

public class ArrayQueueUsingOnePtr {
    int[] queue;
    int rear;
    int capacity;

    public ArrayQueueUsingOnePtr(int size){
        this.capacity=size;
        rear=-1;
        this.queue=new int[size];
        System.out.println("Queue has been created of size "+size);
    }
    public void enqueue(int x){
        if(isFull()){
            System.out.println("Cannot insert because queue is full");
            return;
        }
        rear++;
        queue[rear]=x;
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("cannot delete because Queue is empty.");
            return -1;
        }
        int removedElement=queue[0];
        for(int i=1;i<=rear;i++){
            queue[i-1]=queue[i];
        }
        rear--;
        return removedElement;
    }

    public boolean isFull(){
        return rear==queue.length-1;
        /*if(rear==queue.length-1){
            return true;
        }
        return false; */
    }
    public boolean isEmpty(){
        return rear==-1;
    }
    public int front(){
        if(isEmpty()){
            System.out.println("Cannot peek because queue is empty");
            return -1;
        }
        return queue[0];
    }
    public void display(){
        if(isEmpty()) {
            System.out.println("cannot delete because Queue is empty.");
            return;
        }
        for(int i=0;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
    }
    public static void main(String[] args) {
        ArrayQueueUsingOnePtr queue=new ArrayQueueUsingOnePtr(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        System.out.println("\nRemoved element is :"+queue.dequeue());
        System.out.println("\nFront element is : "+queue.front());
        queue.display();
    }
}
