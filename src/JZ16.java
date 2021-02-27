public class JZ16 {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode pre=new ListNode(-1);
        ListNode result=pre;
        if (list1==null && list2==null) return null;
        else if(list1==null) return list2;
        else if (list2==null) return list1;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                pre.next=list1;
                list1=list1.next;
                pre=pre.next;
            }
            else {
                pre.next = list2;
                list2 = list2.next;
                pre=pre.next;
            }
        }
        if (list1==null) {
            pre.next=list2;
            return result.next;
        }
        pre.next=list1;
        return result.next;

    }
}


//解法二  用递归的思想
//代码没有看懂