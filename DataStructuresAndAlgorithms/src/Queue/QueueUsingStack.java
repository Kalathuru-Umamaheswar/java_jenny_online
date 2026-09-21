package Queue;

import java.util.Stack;

public class QueueUsingStack {
    Stack<Integer> stack1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();

    void enqueue(int x){
        stack1.push(x);
    }
    int dequeue(){
        if(empty()){
            System.out.println("Cannot deque because queue is empty");
            return -1;
        }
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int removedElement=stack2.pop();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return removedElement;
    }
    int front(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        int peekedElement=stack2.peek();
        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return peekedElement;
    }
    boolean empty(){
        return stack1.isEmpty();
    }
    public static void main(String[] args) {
        QueueUsingStack queue=new QueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Removed element is :"+queue.dequeue());
        System.out.println("Removed element is :"+queue.dequeue());
        System.out.println("Removed element is :"+queue.dequeue());
        System.out.println("Removed element is :"+queue.dequeue());
        System.out.println("Front element is :"+queue.front());
    }
}
