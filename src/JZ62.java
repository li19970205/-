import java.util.ArrayList;

//二叉搜索树的第k个结点
public class JZ62 {
    ArrayList<TreeNode> list=new ArrayList<TreeNode>();
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        if(pRoot==null || k<=0) return null;
        travel(pRoot);  //中序遍历
        if(k>list.size()) return null;
       return list.get(k-1);
    }

    void travel(TreeNode head){
        if(head!=null) {
            travel(head.left);
            list.add(head);
            travel(head.right);
        }

    }

//解法二 不需要额外的空间存储遍历结果
    TreeNode KthNode(TreeNode pRoot, int k) {
        TreeNode target;
        int k1 = 0;
        TreeNode KthNode (TreeNode pRoot,int k)
        {
            if (pRoot == null || k <= 0) return null;
            k1 = k;
            travel(pRoot);  //中序遍历
            return target;
        }

        void travel (TreeNode head){
            if (head != null) {
                travel(head.left);
                k1--;
                if (k1 == 0) target = head;
                travel(head.right);
            }

        }
    }
}

}