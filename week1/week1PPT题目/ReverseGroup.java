package week1PPT题目;

import java.util.List;

//https://leetcode-cn.com/problems/reverse-nodes-in-k-group/
//k个节点为一组交换
public class ReverseGroup {
//    1
//    public ListNode reverseKGroup(ListNode head,int k){
//        ListNode curr = head;
//        int count = 0;
//        while (curr!=null && count !=k){
//            curr = curr.next;
//            count++;
//        }
//        if (count == k){
//            curr = reverseKGroup(curr, k);
//            while (count-- >0){
//                ListNode next = head.next;
//                head.next = curr;
//                curr = head;
//                head = next;
//            }
//            head = curr;
//        }
//        return  head;
//    }

//    2
//    public ListNode reverseKGroup(ListNode head,int k){
//        ListNode curr = head;
//        int count = 0;
//        while (curr!= null&&count!=k){
//            curr = curr.next;
//            count++;
//        }
//        if (count==k){
//            curr = reverseKGroup(curr, k);
//            while (count-- >0){
//                ListNode  next = head.next;
//                head.next = curr;
//                curr = head;
//                head = next;
//            }
//            head = curr;
//        }
//        return head;
//    }

//    3
//    public  ListNode reverseKGroup(ListNode head,int k){
//        ListNode curr = head;
//        int count = 0;
//        while (curr!=null &&count!=k){
//            curr = curr.next;
//            count++;
//        }
//        if (count == k){
//            curr = reverseKGroup(curr, k);
//            while (count-- >0){
//                ListNode next = head.next;
//                head.next = curr;
//                curr = head;
//                head = next;
//            }
//            head = curr;
//        }
//        return head;
//    }

    //    4
//    public ListNode reverseKGroup(ListNode head, int k) {
//        ListNode curr = head;
//        int count = 0;
//        while (curr != null && count != k) {
//            curr = curr.next;
//            count++;
//        }
//        if (count == k) {
//            curr = reverseKGroup(curr, k);
//            while (count-- > 0) {
//                ListNode next = head.next;
//                head.next = curr;
//                curr = head;
//                head = next;
//            }
//            head = curr;
//        }
//        return head;
//    }

//    5
    public ListNode reverseKGroup(ListNode head,int k){
        ListNode curr = head;
        int count = 0;
        while (curr!=null&&count!=k){
            curr = curr.next;
            count++;
        }
        if (count==k){
            curr = reverseKGroup(curr,k);
            while (count-- >0){
                ListNode next = head.next;
                head.next = curr;
                curr = head;
                head = next;
            }
            head = curr;
        }
        return  head;
    }
}
