package TreeDemo;

public class BinaryTreeUsingPreorderAndInorder {
    static Node constructTree(int[] preorder,int[] inorder,int[] preIndex,int inStart,int inEnd){
        if(inStart>inEnd)   return null;
        Node root=new Node(preorder[preIndex[0]]);
        int inIndex=search(inorder,preorder[preIndex[0]],inStart,inEnd);
        preIndex[0]++;
        root.left=constructTree(preorder,inorder,preIndex,inStart,inIndex-1);
        root.right=constructTree(preorder,inorder,preIndex,inIndex+1,inEnd);
        return root;
    }
    static int search(int[] inorder,int val,int start,int end){
        for(int i=start;i<=end;i++){
            if(inorder[i] == val){
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
        int[] preorder={10,5,11,7,15,4};
        int[] inorder={5,11,10,4,15,7};
        int[] preIndex={0};
        Node root=constructTree(preorder,inorder,preIndex,0,inorder.length-1);
        displayTree(root,0);
    }
}
