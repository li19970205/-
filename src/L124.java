//二叉树中最大路径和 L124
public class L124 {
    int ans=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return ans;
    }

    //maxGain函数求得是以该节点为起点的最大路径和
    int maxGain(TreeNode root){
        if (root==null) return 0;
        int left_max=Math.max(0,maxGain(root.left));
        int right_max=Math.max(0,maxGain(root.right));
        int max_path=root.val+left_max+right_max;
        ans=Math.max(ans,max_path);  //最大值不一定是根节点为起点，因此利用ans做一个记录
        return root.val+Math.max(left_max,right_max);
    }
}


