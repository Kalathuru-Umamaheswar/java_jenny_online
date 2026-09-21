import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        // Default initialization of Stack
        Stack stack1 = new Stack();
        // Initialization of Stack using Generics
        Stack<String> stack2 = new Stack<String>();
        // pushing the elements
        stack1.push("4");
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");

        // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);
        System.out.println("The element at the top of the" + " stack1 is: " + stack1.peek());
        System.out.println("The element at the top of the" + " stack2 is: " + stack2.peek());
        // Removing elements using pop() method
        System.out.println("Popped element: "+ stack1.pop());
        System.out.println("Popped element: " + stack1.pop());
        // Displaying the Stack after pop operation
        System.out.println("Stack after pop operation " + stack1);

        System.out.println("Is stack empty? "+ stack1.isEmpty());
        // Pop remaining elements
        stack1.pop();
        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack1.empty());
        //Stack<Integer> s=new Stack<>();
       /* System.out.println(s.capacity());
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        } */

    }
}
