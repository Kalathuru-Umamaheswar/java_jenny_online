package LeetcodeQuestions;

public class FIndMiddle876 {
    Node head;
    Node convertToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i]);
            temp.next = newNode;
            temp = temp.next;
        }
        return head;
    }
    //Approach 1 : Brute Force approach
    /*Node findMiddle(Node head){
        int n=0;
        Node temp=head;
        while (temp!=null){
            n++;
            temp=temp.next;
        }
        int pos=(n/2)+1;
        temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        return temp;
    } */
    //Approach 2 : Optimal (Two pointer) approach
    Node findMiddle(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    static void traverseLL(Node head) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 4, 5,8,9};
        Node head;
        FIndMiddle876 obj = new FIndMiddle876();
        head = obj.convertToLL(arr);
        obj.traverseLL(head);
        head=obj.findMiddle(head);
        obj.traverseLL(head);
    }
}
