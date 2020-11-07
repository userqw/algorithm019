import java.util.List;

public class MergeList {
    /**
     * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * Definition for singly-linked list.
     * public class ListNode{
     *     int val;
     *     ListNode next;
     *     ListNode (){}
     *     ListNode(int val){this.val = val;}
     *     ListNode(int val,ListNode next){this.val=val;this.next=next;}
     * }
     */
    public ListNode MergeList(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(-1);
        ListNode prev=dummyHead;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                prev.next=l1;
                l1=l1.next;
            }else {
                prev.next = l2;
                l2 =l2.next;
            }
            prev = prev.next;
        }
        prev.next=l1==null?l2:l1;

        return dummyHead.next;

    }

}
