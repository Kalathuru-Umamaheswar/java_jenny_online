package TreeDemo;

import java.util.*;

public class BinaryTree {
    Node createTree(Scanner sc){
        System.out.println("Enter node data (-1 for null):");
        int value=sc.nextInt();
        if(value==-1) return null;
        Node newNode=new Node(value);
        System.out.println("Do you want left child of "+value);
        boolean left=sc.nextBoolean();
        if(left){
            newNode.left=createTree(sc);
        }
        System.out.println("Do you want right child of "+value);
        boolean right=sc.nextBoolean();
        if(right){
            newNode.right=createTree(sc);
        }
        return newNode;
    }
    void displayTree(Node node,int level){
        if(node==null) return;
        displayTree(node.right,level+1);
        for(int i=0;i<level;i++){
            System.out.print("    ");
        }
        System.out.println(node.data);
        displayTree(node.left,level+1);
    }
    void inorderTraversal(Node node){
        if(node==null)  return;
        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }
    void inorderIterative(Node node){
        Stack<Node> stack=new Stack<>();
        while(node!=null || !stack.isEmpty()){
            if(node != null){
                stack.push(node);
                node=node.left;
            }
            else{
                node=stack.pop();
                System.out.print(node.data+" ");
                node=node.right;
            }
        }
    }
    void preorderTraversal(Node node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preorderTraversal(node.left);
        preorderTraversal(node.right);
    }
    void preorderIterative(Node node){
        Stack<Node> stack=new Stack<>();
        while(node!=null || !stack.isEmpty()){
            if(node!=null){
                System.out.print(node.data+" ");
                stack.push(node); //pushing the address of the node
                node=node.left;
            }
            else{
                node=stack.pop();
                node=node.right;
            }
        }
    }
    void postorderTraversal(Node node){
        if(node==null) return;
        postorderTraversal(node.left);
        postorderTraversal(node.right);
        System.out.println(node.data+" ");
    }
    void postorderIterative(Node node){
        Stack<Node> stack=new Stack<>();
        Node lvn=null;
        while(node!=null || !stack.isEmpty()){
            while (node!=null){
                stack.push(node);
                node=node.left;
            }
            Node prevNode=stack.peek();
            if(prevNode.right != null && lvn != prevNode.right){
                node = prevNode.right;
            }
            else{
                System.out.print(prevNode.data+" ");
                lvn=stack.pop();
            }
        }
    }
    void levelorderTraversal(Node node){
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            Node current=queue.remove();
            System.out.print(current.data+" ");
            if(current.left != null){
                queue.add(current.left);
            }
            if(current.right != null){
                queue.add(current.right);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        Node root;
        root=tree.createTree(sc);
        tree.displayTree(root,0);
        //tree.preorderIterative(root);
        //tree.inorderTraversal(root);
        //tree.inorderIterative(root);
        tree.postorderIterative(root);
        //tree.inorderTraversal(root);
        //tree.preorderTraversal(root);
        //tree.postorderTraversal(root);
        //tree.levelorderTraversal(root);
        //LevelOrder102 obj=new LevelOrder102();
        //List<List<Integer>> result=obj.levelOrder(root);
        //System.out.println(result);
    }
}
