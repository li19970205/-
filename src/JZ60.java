import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//把二叉树打印成多行
public class JZ60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        if(pRoot==null) return result;
        queue.offer(pRoot);
        while(!queue.isEmpty()){
            ArrayList<Integer> list=new ArrayList<Integer>();
            for(int i=queue.size();i>0;i--){
                TreeNode tem=queue.poll();
                list.add(tem.val);
                if(tem.left!=null) queue.offer(tem.left);
                if(tem.right!=null) queue.offer(tem.right);
            }
            result.add(list);
        }
        return result;
    }

}