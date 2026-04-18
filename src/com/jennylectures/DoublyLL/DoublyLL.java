package com.jennylectures.DoublyLL;

public class DoublyLL {
    private Node head;
    private Node tail;
    private int size;
    Node insertAtBegining(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return head;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
        return head;
    }

    Node insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return head;
        }
        //Case 1 : when we have tail
        /*tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
        size++;
        return head; */
        //Case 2: When we don't have tail
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.prev=temp;
        size++;
        return head;
    }

    Node insertBeforePosition(int data,int pos){
        if(pos<=0){
            System.out.println("Position is not valid,so can not insert");
            return head;
        }
        if(pos==1){
            return insertAtBegining(data);
        }
        Node newNode=new Node(data);
        Node temp=head;
        int currPosition=1;
        while(temp!=null){
            if(currPosition==pos){
                break; //it will execute the statements after while loop
            }
            temp=temp.next; //if(currPosition!=pos)
            currPosition++;
        }
        //if(currPosition==pos) then the below code will execute
        if(temp==null){
            System.out.println("Position is not valid");
            return head;
        }
        Node prevNode;
        prevNode=temp.prev;
        newNode.next=temp;
        temp.prev=newNode;
        newNode.prev=prevNode;
        prevNode.next=newNode;
        size++;
        return head;
    }

    Node insertAftervalue(int data,int value){
        if(head==null){
            System.out.println("No such value exist so cannot insert");
        }
        Node newNode=new Node(data);
        Node temp=head;
        while(temp!=null && temp.data!=value){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("No such value exist in the list so can not insert");
            return head;
        }
        Node nextNode=temp.next;
        newNode.next=nextNode;
        newNode.prev=temp;
        temp.next=newNode;
        if(nextNode!=null){
            nextNode.prev=newNode;
        }
        size++;
        return head;
    }

    Node deleteFromBegining(){
        if(head==null){
            System.out.println("List is empty");
            return head;
        }
        if(head.next==null){
            head=head.next; //head=null
            tail=null;
            size--;
            return head;
        }
        Node prevNode;
        prevNode=head;
        head=head.next;
        head.prev=null;
        prevNode.next=null;
        size--;
        return head;
    }

    Node deleteFromEnd(){
        if(head==null){
            System.out.println("List is empty");
            return head;
        }
        if(head.next==null){
            head=head.next;
            tail=null;
            size--;
            return head;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node prevNode=temp.prev;
        prevNode.next=null;
        temp.prev=null;
        size--;
        return head;
    }

    Node deleteFromPosition(int pos){
        if(head==null){
            System.out.println("List is empty");
            return head;
        }
        if(pos==1){
            return deleteFromBegining();
        }
        Node temp=head;
        int currPosition=1;
        while(temp!=null){
            if(currPosition==pos){
                break;
            }
            temp=temp.next;
            currPosition++;
        }
        if(temp==null){
            System.out.println("Given position is not valid. So can not delete");
            return head;
        }
        Node prevNode,nextNode;
        prevNode=temp.prev;
        nextNode=temp.next;
        prevNode.next=temp.next;
        if(nextNode!=null){
            nextNode.prev=prevNode;
            temp.next=null;
        }
        temp.prev=null;
        size--;
        return head;
    }

    Node deleteValue(int val){
        if(head==null){
            System.out.println("List is empty.So can not delete");
            return head;
        }
        if(head.data==val){
            return deleteFromBegining();
        }
        Node temp=head;
        while (temp!=null && temp.data!=val){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("No such value exist in this list.So cannot delete");
            return head;
        }
        Node prevNode=temp.prev;
        prevNode.next=temp.next;
        if(temp.next!=null){
            temp.next.prev=prevNode;
            temp.next=null;
        }
        temp.prev=null;
        size--;
        return head;
    }

    int countNodes(Node head){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    boolean searchElementDLL(Node head,int value){
        if(head==null){
            return false;
        }
        //Case 1:we have only head
        /*Node temp=head;
        while(temp!=null){
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        }
        return false; */

        //Case 2:we have both head and tail
        while(head!=tail && head.prev!=tail){
            if(head.data==value || tail.data==value){
                return true;
            }
            head=head.next;
            tail=tail.prev;
        }
        if(head==tail && head.data==value){
            return true;
        }
        return false; //out of the while loop if the while loop is false
    }
    Node reverseDLL(Node head){
        if(head==null){
            return head;
        }
        Node temp=head;
        Node current=null;
        while (temp!=null){
            current=temp.prev;
            temp.prev=temp.next;
            temp.next=current;
            temp=temp.prev;
        }
        head=current.prev;
        return head;
    }

    boolean isPalindrome(Node head){
        if(head==null){
            return false;
        }
        while(head!=tail && head.prev!=tail){
            if(head.data!=tail.data){
                return false;
            }
            head=head.next;
            tail=tail.prev;
        }
        return true;
    }
    void traverseDLL(Node head){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp=head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
        }
        System.out.println();
    }

    void reverseTraverse(Node head){
        Node temp=head;
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            while(temp.next!=null){ //Find last node
                temp=temp.next;
            }
        }
        while(temp!=null){ //Move Backward
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLL obj=new DoublyLL();
        Node head;
//        head=obj.insertAtBegining(15);
//        head=obj.insertAtBegining(34);
//
//        //obj.traverseDLL(head);
//        head=obj.insertAtEnd(56);
//        obj.traverseDLL(head);
//        head=obj.insertBeforePosition(100,2);
//        obj.traverseDLL(head);
//        head=obj.insertAftervalue(20 ,15);
//        obj.traverseDLL(head);
        //obj.reverseTraverse(head);
        //head=obj.deleteFromBegining();
        //obj.traverseDLL(head);
        //head=obj.deleteFromBegining();
        //obj.traverseDLL(head);
        //head=obj.deleteFromEnd();
        //head=obj.deleteFromPosition(2);
        //head=obj.deleteValue(56);
        //obj.traverseDLL(head);
        //System.out.println(obj.countNodes(head));
        //System.out.println(obj.searchElementDLL(head,15));
        //head=obj.reverseDLL(head);
        //obj.traverseDLL(head);
        head=obj.insertAtBegining(1);
        head=obj.insertAtBegining(2);
        head=obj.insertAtBegining(3);
        head=obj.insertAtBegining(2);
        head=obj.insertAtBegining(1);
        System.out.println(obj.isPalindrome(head));
    }
}
