package week1PPT题目;
//https://leetcode-cn.com/problems/linked-list-cycle-ii/
//返回开始入环的第一个结点
public class DetectCycle {
//    public ListNode detectCycle(ListNode head) {
//        ListNode fast = head, slow = head;
//        while (true) {
//            if (fast == null || fast.next == null) return null;
//            fast = fast.next.next;
//            slow = slow.next;
//            if (fast == slow) break;
//        }
//        fast = head;
//        while (slow != fast) {
//            slow = slow.next;
//            fast = fast.next;
//        }
//        return fast;
//    }
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while (true){
            if (fast == null || fast.next == null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow )break;
        }
        fast = head;
        while (fast != slow){

            slow = slow.next;
            fast = fast.next;
        }
        return fast;

    }

}
