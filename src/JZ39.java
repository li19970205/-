import com.sun.source.tree.Tree;

import java.util.HashMap;

//平衡二叉树
public class JZ39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        return travel(root)!=-1;

    }
//返回结点的高度,travel()函数返回结点的高度
    int travel(TreeNode root){
        if (root==null) return 0;
        int left_num=travel(root.left);
        if(left_num==-1) return -1;  //如果不平衡，则停止访问
        int right_num=travel(root.right);
        if (right_num==-1) return -1;
        if(Math.abs(left_num-right_num)>1) return -1;
        return 1+(left_num>right_num?left_num:right_num);
    }
}