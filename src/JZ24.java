import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JZ24 {
    ArrayList<ArrayList<Integer>> result=new ArrayList<>();
    ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        if(root==null) return result;
        list.add(root.val);
        target=target-root.val;
        if (target==0 && root.left==null && root.right==null){
            result.add(list);
            list=new ArrayList<>();//对list再重新初始化
        }
        ArrayList<ArrayList<Integer>> result1=FindPath(root.left,target);
        ArrayList<ArrayList<Integer>> result2=FindPath(root.right,target);
        return result;
    }
    }