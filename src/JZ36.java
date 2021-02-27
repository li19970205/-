import java.util.HashMap;

//两个链表的第一个公共结点
public class JZ36 {
    //方法一：用哈希表存储
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        HashMap<ListNode,Integer> map=new HashMap<ListNode,Integer>();
        if(pHead1==null || pHead2==null) return null;
        while(pHead1!=null){
            map.put(pHead1,1);
            pHead1=pHead1.next;
        }

        //遍历pHead2
        while(pHead2!=null){
            if(map.containsKey(pHead2)) return pHead2;
            else pHead2 = pHead2.next;
        }
        return null;
    }

    //方法二：将两个链表变成一样长
    public ListNode FindFirstCommonNode01(ListNode pHead1, ListNode pHead2) {
      if(pHead1==null || pHead2==null) return null;
      ListNode p1=pHead1,p2=pHead2;
      while (p1!=p2){
          p1=p1.next;
          p2=p2.next;
          //这块的if判断，表示如果两者都为null,则跳出循环，即两者没有公共结点
          if(p1!=p2) {
              if (p1 == null) p1 = pHead2;
              if (p2 == null) p2 = pHead1;
          }
      }
      return p1;
    }
}
