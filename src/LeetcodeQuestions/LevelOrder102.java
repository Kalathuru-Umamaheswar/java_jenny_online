package LeetcodeQuestions;
import TreeDemo.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
public class LevelOrder102 {
    public List<List<Integer>> levelOrder(TreeDemo.Node node){
        List<List<Integer>> list=new ArrayList<>();
        if(node==null) return list;
        Queue<TreeDemo.Node> queue=new LinkedList<>();
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
}
