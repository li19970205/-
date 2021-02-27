//二叉树的深度
public class JZ38 {
    public int TreeDepth(TreeNode root) {
        //前序遍历框架
        //base case
        if(root==null) return 0;
        int left_num= TreeDepth(root.left);
        int right_num=TreeDepth(root.right);
        return 1+Math.max(left_num,right_num);
    }
}