//对称的二叉树
public class JZ58 {
    boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null) return true;
        return isDuichen(pRoot.left,pRoot.right);
    }
    //判断两颗数是否对称
    boolean isDuichen(TreeNode pRoot1,TreeNode pRoot2){
        if(pRoot1==null & pRoot2==null) return true;
        if(pRoot1==null || pRoot2==null) return false;
        if(pRoot1.val==pRoot2.val) return isDuichen(pRoot1.left,pRoot2.right) && isDuichen(pRoot1.right,pRoot2.left);
        return false;
    }

}
