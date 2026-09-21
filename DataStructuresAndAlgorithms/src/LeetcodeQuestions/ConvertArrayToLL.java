package LeetcodeQuestions;
public class ConvertArrayToLL {
    Node convertToLL(int[] arr){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=temp.next;
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


    }

    public static void main(String[] args) {
        int[] arr={10,3,2,4,5};
        Node head1;
        ConvertArrayToLL obj=new ConvertArrayToLL();
        head1=obj.convertToLL(arr);
        obj.traverseLL(head1);

    }
}
