//二叉树的镜像
public class JZ18 {
    public void Mirror(TreeNode root)
    {
        if(root==null) return;
        if(root.left==null && root.right==null) return;
        TreeNode tem = root.left;
        root.left = root.right;
        root.right = tem;

        Mirror(root.left);
        Mirror(root.right);

}
}