//链表中环的入口节点
public class JZ55 {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode slow=pHead,fast=pHead;
        int count=0;//默认没有环
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast) {
                count=1;
                break;
            }
        }
        //如果有环，让慢指针指向头结点，然后和快指针以相同速度访问，直到两者相等时时，即为环的入口
        if (count==1){
            slow=pHead;
            while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
            }
            return slow;
        }
        //没有环
        return null;
    }
}