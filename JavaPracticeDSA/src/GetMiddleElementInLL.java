
public class GetMiddleElementInLL {
    class Node{ // special variable
        int data;
        Node next;
        public Node(int d){
            data = d;
            next = null;
        }
    }


    public static void main(String[] args) {

    }
        int getMiddle(Node head){
            Node fast=head,slow=head;
            while(fast!=null && fast.next!=null){
                fast = fast.next.next;
                slow=slow.next;
            }
            return slow.data;
    }
        }
