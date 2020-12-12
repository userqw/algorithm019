package week1PPT题目;

import java.util.HashSet;
import java.util.Set;

//https://leetcode-cn.com/problems/linked-list-cycle/solution/huan-xing-lian-biao-by-leetcode-solution/
//判断一个链表中是否有环
public class HasCycle {
//    两种方法：哈希表、快慢指针
    /**
    public boolean hasCycle1(ListNode head){
        Set<ListNode> visited = new HashSet<>();
        while (head!=null){
            if (!visited.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle2(ListNode head){
        if (head == null|| head.next ==null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow !=fast){
            if (fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return  true;
    }
 **/
    public boolean hasCycle(ListNode head){
        if (head == null || head.next == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast){
            if (fast ==null|| fast.next == null){
                return  false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
