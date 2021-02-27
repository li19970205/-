import java.util.ArrayList;
import java.util.HashMap;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}

public class JZ57 {
    ArrayList<TreeLinkNode> list=new ArrayList<TreeLinkNode>();
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode==null) return pNode;
        TreeLinkNode head=pNode;
        //找到头结点
        while(head.next!=null){
            head=head.next;
        }

        //中序遍历
        travel(head);

        //遍历中序遍历的结果，找到目标节点
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)==pNode) return list.get(i+1);
        }
        return null;

    }
    //中序遍历框架
    void travel(TreeLinkNode tree) {
        if (tree != null) {
            travel(tree.left);
            list.add(tree);
            travel(tree.right);
        }
    }
}