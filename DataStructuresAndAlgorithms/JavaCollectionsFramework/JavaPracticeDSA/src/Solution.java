public class Solution {
    class Node{ // special variable
        int data;
        Node next;
        public Node(int d){
            data = d;
            next = null;
        }
    }
    public int cycleStart(Node head){
        Node fast = head,slow=head;
        while(true){
            fast=fast.next.next;
            slow=slow.next;
            if(fast == null || fast.next == null){
                return;
            }
            if(fast==slow){
                fast=head;
                break;
            }
        }
        if(slow==head){
            while(true){
                slow=slow.next;
                if(slow.next==head){
                    slow.next=null;
                    return;
                }
            }
        }
    }

    }

