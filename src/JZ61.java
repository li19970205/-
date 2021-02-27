//序列化和反序列化二叉树

import java.util.LinkedList;

//解法一 利用前序遍历来序列化和反序列化二叉树
public class JZ61 {
    StringBuilder result=new StringBuilder();
    //利用前序遍历来序列化
    String Serialize(TreeNode root) {
        if(root==null) {
            result.append('#').append(',');
            return result.toString();
        }
        result.append(root.val);
        result.append(',');
        Serialize(root.left);
        Serialize(root.right);
        return result.toString();
    }

    //反序列化
    TreeNode Deserialize(String str) {
        if(str.length()==0) return null;
        //将String转换成列表
        LinkedList<String> nodes=new LinkedList<String>();
        for(String s:str.split(",")) nodes.add(s);
        return deserialize(nodes);
    }

    TreeNode deserialize(LinkedList<String> nodes){
        if(nodes.size()==0) return null;
        String first=nodes.removeFirst();  //找到根节点
        if(first.equals("#")) return null;
        //前序遍历位置
        TreeNode root=new TreeNode(Integer.parseInt(first));
        root.left=deserialize(nodes);
        root.right=deserialize(nodes);
        return root;
    }
}