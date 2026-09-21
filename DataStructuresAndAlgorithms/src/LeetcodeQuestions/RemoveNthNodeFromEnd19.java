package LeetcodeQuestions;

public class RemoveNthNodeFromEnd19 {
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

    Node removeNthNodeFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 2, 4, 5};
        Node head1;
        RemoveNthNodeFromEnd19 obj = new RemoveNthNodeFromEnd19();
        head1 = obj.convertToLL(arr);
        obj.traverseLL(head1);
        head1=obj.removeNthNodeFromEnd(head1,2);
        obj.traverseLL(head1);
    }
}
