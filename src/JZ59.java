import java.util.*;

//按之字形顺序打印二叉树
public class JZ59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        if (pRoot==null) return  result;
        //用队列存储结点
        Queue<TreeNode> queue=new LinkedList<TreeNode>();
        queue.offer(pRoot);
        int count=1;//记录层数
        //层次遍历框架
        while(!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = queue.size(); i >0; i--) {
                TreeNode cur = queue.poll();
                list.add(cur.val);
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
            if(result.size()%2==1)  Collections.reverse(list); //将list中的元素逆序
            result.add(list);
        }
        return result;

    }

}



