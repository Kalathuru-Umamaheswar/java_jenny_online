package LinkedList;

public class SinglyLL {
    static Node head;
    static Node tail;
    static int size;

    static void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        if (tail == null) {
            tail = newNode;
        }
        size++;
    }

    static void inserAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            //newNode.next = null;
            //head=newNode;
            insertAtBeginning(data);
            return;
        }
         /*tail.next=newNode;
         tail=tail.next;  //tail=newNode;
         size++; */
        Node temp;
        temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        size++;
    }

    static void insertAtPosition(int data, int pos) {
        Node newNode = new Node(data);
        if (pos <= 0 || pos > size + 1) {
            System.out.println("Position is not valid");
            return;
        }
        if (head == null) {
            if (pos == 1) {
                insertAtBeginning(data);
                return;
            }
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            size++;
            return;
        }
        int currentPosition = 1;
        Node temp;
        temp = head;
        while (currentPosition < pos - 1) {
            temp = temp.next;
            currentPosition++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        size++;
    }

    static void insertAfterValue(int data, int value) {
        Node newNode = new Node(data);
        Node temp;
        temp = head;
        while ((temp != null) && (temp.data != value)) {
            temp = temp.next;
        }
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        } else {  //temp==null
            System.out.println("No such value exist in the list So can not insert the data.");
        }
    }

    static void deleteFromBeginning() {
        if (head == null) {
            System.out.println("Cannot delete because list is empty");
            return;
        }
        System.out.println("Deleted node is " + head.data);
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
    }

    static void deleteFromEnd() {
        if (head == null) {
            System.out.println("Cannot delete because list is empty");
            return;
        }
        if (head.next == null) { //Only one node present in the list
            System.out.println("Deleted node is " + head.data);
            head = head.next; //head=null
            tail = null;
            size--;
            return;
        }
        Node temp;
        temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        System.out.println("Deleted node is " + temp.next.data);
        temp.next = temp.next.next;//temp.next=null
        size--;
    }

    static void deleteFromPosition(int pos) {
        if (head == null) {
            System.out.println("Cannot delete because list is empty");
            return;
        }
        if (pos == 1) {
            deleteFromBeginning();
            return;
        }
         /*if(pos<=0 || pos>size){
             System.out.println("Given position is not valid so can not delete any node.");
             return;
         }
         int currPos=1;
         Node temp;
         temp=head;
         while(currPos<pos-1){
             temp=temp.next;
             currPos++;
         }
         System.out.println("Deleted node is "+temp.next.data);
         temp.next=temp.next.next;
         size--;
     } */
        int currPos = 1;
        Node temp, prevNode;
        prevNode = null;
        temp = head;
        while (temp != null) {
            if (currPos == pos) {
                System.out.println("Deleted node is : " + temp.data);
                prevNode.next = temp.next;
                size--;
                return;
            }
            prevNode=temp;
            temp=temp.next;
            currPos++;
        }
    }

        static void deleteValue(int value){
        if(head==null){
            System.out.println("Cannot delete because list is empty");
            return;
        }
        if (head.data==value){
            System.out.println("Deleted node is :"+head.data);
            head=head.next;
            size--;
            //deleteFromBeginning();
            return;
        }
        Node temp,prevNode;
        prevNode=null;
        temp=head;
        while((temp != null) && (temp.data != value)){
            prevNode=temp;
            temp=temp.next;
        }
        if(temp!=null){
            System.out.println("Deleted node is "+temp.data);
            prevNode.next=temp.next;
            size--;
        }
        else{
            System.out.println("No such node exist in the list");
        }
        }
        static void traverseLL() {
            if (head == null) {
                System.out.println("List is empty");
                return;
            }
            Node temp;
            temp = head;
            while (temp != null) {
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("END");

        }

        static void findLength(){
        Node temp;
        temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
            System.out.println("Length of Linked List is :"+count);
        }

        static boolean searchElement(int value){
        Node temp;
        temp=head;
        while(temp!=null){
            if(temp.data==value){
                return true;
            }
            temp=temp.next;
        }
        return false; //element is not found in the list
        }

        static void reverseLL(){
            if(head==null){
                System.out.println("List is empty so we cannot reverse it.");
                return;
            }
            if(head.next==null){
                System.out.println("Only one element in the list.");
                System.out.println(head.data);
                return;
            }
            Node temp,prevNode,nextNode;
            temp=head;
            prevNode=null;
            while (temp!=null){
                nextNode=temp.next;
                temp.next=prevNode;
                prevNode=temp;
                temp=nextNode;
            }
            head=prevNode;
        }
        public static void main (String[]args){
           // SinglyLL obj = new SinglyLL();
            //obj.insertAtBeginning(10);
            insertAtBeginning(10);
//            insertAtBeginning(100);
//            insertAtBeginning(101);
//            insertAtBeginning(134);
            inserAtEnd(100);
            inserAtEnd(101);
            inserAtEnd(134);
            insertAtPosition(25, 2);
            insertAfterValue(189, 10);
            //deleteFromBeginning();
            traverseLL();
            //deleteFromBeginning();
            //traverseLL();
            //deleteFromEnd();
            //traverseLL();
//            deleteFromPosition(2);
//            traverseLL();
//            deleteValue(100);
//            traverseLL();
//            findLength();
//            System.out.println(searchElement(25));
            reverseLL();
            traverseLL();
        }
    }


