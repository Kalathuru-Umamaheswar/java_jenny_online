package Stack;

public class StackUsingArrayMain {
    public static void main(String[] args) {
        StackUsingArray stack=new StackUsingArray(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
