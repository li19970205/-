import java.util.ArrayList;
import java.util.LinkedList;

//字符串排列
public class JZ27 {
    ArrayList<String> res=new ArrayList<String>();
    public ArrayList<String> Permutation(String str) {
        LinkedList<String> track=new LinkedList<String>(); //记录路径
        String[] nums=str.split("");
        backward(nums,track,0);
        return res;
    }

    void backward(String[] strs,LinkedList<String> track,int shu){

        if (strs.length==track.size()){
            String new_track="";
            for (String t:track) new_track+=t;
            res.add(new_track);
            return ;
        }
        for (int i=0;i<strs.length;i++){
            if(shu==i) continue;
            shu=i;
//            if (track.contains(strs[i])) continue;
            track.add(strs[i]);  //做选择
            backward(strs,track,shu);
            track.removeLast();  //插销选择
        }

    }
}