package TreeDemo;

import java.util.*;

public class LevelOrder102 {
    public List<List<Integer>> levelOrder(Node node){
        List<List<Integer>> list=new ArrayList<>();
        if(node==null) return list;
        Queue<Node> queue=new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            List<Integer> sublist=new ArrayList<>();
            int levelSize=queue.size();
            for(int i=0;i<levelSize;i++){
                Node current=queue.remove();
                sublist.add(current.data);
                if(current.left != null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
            }
            list.add(sublist);
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        Node root;
        root=tree.createTree(sc);
        tree.displayTree(root,0);
        //tree.inorderTraversal(root);
        //tree.preorderTraversal(root);
        //tree.postorderTraversal(root);
        //tree.levelorderTraversal(root);
        LevelOrder102 obj=new LevelOrder102();
        List<List<Integer>> result=obj.levelOrder(root);
        System.out.println(result);
    }
}
