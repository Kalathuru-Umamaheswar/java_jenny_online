package LeetcodeQuestions;

import Stack.StackUsingLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue225 {
    Queue<Integer> queue1=new LinkedList<>();
    Queue<Integer> queue2=new LinkedList<>();

    void push(int x){
        while(!queue1.isEmpty()){
            queue2.add(queue1.remove());
        }
        queue1.add(x);
        while(!queue2.isEmpty()){
            queue1.add(queue2.remove());
        }
    }
    int pop(){
        if(empty()){
            System.out.println("Cannot pop because stack is empty");
        }
        return queue1.remove();
    }
    int peek(){
        if(empty()){
            System.out.println("Cannot pop because stack is empty");
        }
        return queue1.peek();
    }
    boolean empty(){
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Popped element is :"+stack.pop());
        System.out.println("Popped element is :"+stack.pop());
        System.out.println("Popped element is :"+stack.pop());
        System.out.println("Popped element is :"+stack.pop());
        System.out.println("Top element is :"+stack.peek());
    }
}
