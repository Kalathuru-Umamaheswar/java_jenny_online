package Stack;

public class StackUsingLinkedList {
    public Node top;
    public StackUsingLinkedList(){
        this.top=null;
    }
    public void push(int value){
        Node newNode=new Node(value);
        newNode.next=top;
        top=newNode;
    }
    public int pop() {
        if(isEmpty()){
            System.out.println("Cannot pop because list is empty");
            return -1;
        }
        int x = top.data;
        top = top.next;
        return x;
    }
    boolean isEmpty(){
        //return top==null;
        if(top==null){
            return true;
        }
        return false;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Cannot pop because list is empty");
            return -1;
        }
        return top.data;
    }

    public static void main(String[] args) {
        StackUsingLinkedList stack=new StackUsingLinkedList();
        stack.push(12);
        stack.push(22);
        stack.push(34);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        //System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
