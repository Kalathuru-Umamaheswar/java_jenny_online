package LeetcodeQuestions;

import java.util.Stack;

public class MinStack155 {
    Stack<Integer> mainStack=new Stack<>();
    Stack<Integer> minStack=new Stack<>();
    void push(int val){
        mainStack.push(val);
        if(minStack.isEmpty() || val<minStack.peek()){
            minStack.push(val);
        }
    }
    void pop(){
        int removedElement=mainStack.pop();
        if(removedElement==minStack.peek()){
            minStack.pop();
        }
    }
    int top(){
        return mainStack.peek();
    }
    int getMin(){
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack155 obj=new MinStack155();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        System.out.println("Minimum element is :"+obj.getMin());
        obj.push(60);
        obj.push(4);
        System.out.println("Minimum element is :"+obj.getMin());
        obj.pop();
        System.out.println("Minimum element is :"+obj.getMin());

    }
}
