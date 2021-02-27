//删除链表中重复的结点
public class JZ56 {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead==null || pHead.next==null) return pHead;

        ListNode head=new ListNode(Integer.MIN_VALUE);  //构建辅助头结点
        ListNode pre=head;
        ListNode cur=pHead;
        head.next=pHead;
        while(cur!=null) {
            if (cur.next!=null && cur.val == cur.next.val) {
                while (cur.next!=null && cur.val==cur.next.val) {cur=cur.next;}
                cur=cur.next;
                pre.next=cur;

            }
            else {
                pre.next = cur;
                pre = pre.next;
                cur = cur.next;
            }
        }
        return head.next;

    }
}