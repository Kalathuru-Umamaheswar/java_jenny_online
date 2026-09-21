package TreeDemo;

import java.util.Stack;

public class CreateBST {
    Node root;
    CreateBST(){
        root=null;
    }
    //insert us ing recursion
    Node insert(Node node,int val){
        if(node==null){
            node=new Node(val);
            return node;
        }
        if(val > node.data){
            node.right=insert(node.right,val);
        }
        else{
            node.left=insert(node.left,val);
        }
        return node ;
    }
    //insert iterative
    void insertNode(Node node,int key){
        Node prevNode=null;
        if(node==null){
            node=new Node(key);
            return;
        }
        while (node != null) {
            prevNode=node;
            if(key==node.data){
                System.out.println("Duplicates are not allowed");
            }
            if(key>node.data){
                node=node.right;
            }
            else{
                node=node.left;
            }
        }
        Node newNode=new Node(key);
        if(key>prevNode.data){
            prevNode.right=newNode;
        }
        else{
            prevNode.left=newNode;
        }
    }

    Node deleteNode(Node node,int key){
        if(node==null)  return null;
        if(key>node.data)
            node.right=deleteNode(node.right,key);
        else if(key<node.data)
            node.left=deleteNode(node.left,key);
        else {
            if(node.left==null && node.right==null)
                return null;
            else if(node.left==null)
                return node.right;
            else if(node.right==null)
                return node.left;
            else{
                Node inorderSuccessor=findInorderSuccessor(node.right);
                node.data=inorderSuccessor.data;
                node.right=deleteNode(node.right,inorderSuccessor.data);
            }
        }
        return node;
    }
    Node findInorderSuccessor(Node node){
        while (node.left!=null){
            node=node.left;
        }
        return node;
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
    //Recursive search method
    boolean search(Node node,int key){
        if(node==null)  return false;
        if(node.data==key)  return true;
        if(key>node.data){
            return search(node.right,key);
        }
        else{
            return search(node.left,key);
        }
    }
    //Iterative Search method
    boolean iterativeSearch(Node node,int key){
        if(node==null)  return false;
        while(node!=null){
            if(root.data==key)  return true;
            if(key>root.data){
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return false;
    }
    Node bstFromPreorder(int[] pre,int start,int end){
        if(start>end)   return null;
        Node root=new Node(pre[start]);
        int i;
        for(i=start+1;i<=end;i++){
            if(pre[i]>pre[start])   break;
        }
        root.left=bstFromPreorder(pre,start+1,i-1);
        root.right=bstFromPreorder(pre,i,end);
        return root;
    }
    Node bstFromPreorderIterative(int[] pre){
        if(pre.length==0)   return null;
        Stack<Node> stack=new Stack<>();
        Node root=new Node(pre[0]);
        stack.push(root);
        for(int i=1;i<pre.length;i++){
            Node node=new Node(pre[i]);
            if(pre[i]<stack.peek().data){
                stack.peek().left=node;
                stack.push(node);
            }
            else{
                Node parent=null;
                while(!stack.isEmpty() && pre[i]>stack.peek().data){
                    parent=stack.pop();
                }
                parent.right=node;
                stack.push(node);
            }
        }
        return root;
    }
    Node bstFromPostorder(int[] postorder,int start,int end){
        if(start>end)   return null;
        Node root=new Node(postorder[end]);
        int i;
        for(i=end-1;i>=0;i--){
            if(postorder[i]<postorder[end])
                break;
        }
        root.left=bstFromPostorder(postorder,start,i);
        root.right=bstFromPostorder(postorder,i+1,end-1);
        return root  ;
    }
    Node bstFromPostorderIterative(int[] postorder){
        if(postorder.length==0) return null;
        Stack<Node> stack=new Stack<>();
        Node root=new Node(postorder[postorder.length-1]);
        stack.push(root);
        for(int i=postorder.length-2;i>=0;i--){
            Node node=new Node(postorder[i]);
            if(postorder[i]>stack.peek().data){
                stack.peek().right=node;
                stack.push(node);
            }
            else{
                Node parent=null;
                while(!stack.isEmpty() && postorder[i]<stack.peek().data){
                    parent=stack.pop();
                }
                parent.left=node;
                stack.push(node);
            }
        }
        return root;
    }
    public static void main(String[] args) {
        CreateBST tree=new CreateBST();
        //int[] preorder={10,5,4,7,11,15,12,20,18};
        int[] postorder={4,7,5,12,20,15,11,10};
        //tree.root=tree.bstFromPostorder(postorder,0,postorder.length-1);
        tree.root=tree.bstFromPostorderIterative(postorder);
        //tree.root=tree.bstFromPreorder(preorder,0,preorder.length-1);
        //tree.root=tree.bstFromPreorderIterative(preorder);
        //int[] arr={50,60,70,80,90,95,98};
//        int key=20;
//        for(int val:arr){
//            tree.root=tree.insert(tree.root,val);
//        }
        tree.displayTree(tree.root,0 );
         tree.inorderTraversal(tree.root);
        //System.out.println(tree.search(tree.root,key));
        //System.out.println(tree.iterativeSearch(tree.root,key));
        //tree.insertNode(tree.root,key);
        //tree.displayTree(tree.root,0 );
        //tree.inorderTraversal(tree.root);
//        tree.deleteNode(tree.root,key);
//        System.out.println("Tree after deleting "+key);
//        tree.displayTree(tree.root,key);
    }
}.. ...
