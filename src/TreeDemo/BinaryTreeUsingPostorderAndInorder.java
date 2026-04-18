package TreeDemo;

public class BinaryTreeUsingPostorderAndInorder {
    static Node constructTree(int[] postorder,int[] inorder,int[] postIndex,int inStart,int inEnd){
        if(inStart>inEnd)   return null;
        Node root=new Node(postorder[postIndex[0]]);
        int inIndex=search(inorder,postorder[postIndex[0]],inStart,inEnd);
        postIndex[0]--;
        root.right=constructTree(postorder,inorder,postIndex,inIndex+1,inEnd);
        root.left=constructTree(postorder,inorder,postIndex,inStart,inIndex-1);
        return root;

    }
    static int search(int[] inorder,int value,int start,int end){
        for(int i=start;i<=end;i++){
            if(inorder[i]==value){
                return i;
            }
        }
        return -1;
    }
    static void displayTree(Node node,int level){
        if(node==null) return;
        displayTree(node.right,level+1);
        for(int i=0;i<level;i++){
            System.out.print("    ");
        }
        System.out.println(node.data);
        displayTree(node.left,level+1);
    }
    public static void main(String[] args) {
        int[] postorder={11,5,4,15,7,10};
        int[] inorder={5,11,10,4,15,7};
        if(inorder == null || postorder == null || inorder.length != postorder.length){
            System.out.println("Can not build binary tree.Please provide valid Inorder and Postorder");
        }
        int[] postIndex={postorder.length-1};
        Node root=constructTree(postorder,inorder,postIndex,0,inorder.length-1);
        displayTree(root,0);
    }
}
