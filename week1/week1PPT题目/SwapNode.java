package week1PPT题目;

import java.util.List;

//https://leetcode-cn.com/problems/swap-nodes-in-pairs/
//链表两两交换相邻结点
public class SwapNode {
//    递归法
//    1
//    public ListNode swapPairs(ListNode  head){
//        if (head == null || head.next == null){
//            return  head;
//        }
//        ListNode nextNode = head.next;
//        head.next = swapPairs(nextNode.next);
//        nextNode.next = head;
//        return nextNode;
//    }

//    2
//    public ListNode swapPairs(ListNode head){
//        if (head == null|| head.next == null){
//            return  head;
//        }
//        ListNode newHead = head.next;
//        head.next = swapPairs(newHead.next);
//        newHead.next = head;
//        return newHead;
//    }

//    3
//    public ListNode swapPairs(ListNode head){
//        if (head ==null||head.next ==null){
//            return  head;
//        }
//
//        ListNode nextNode = head.next;
//        head.next = swapPairs(nextNode.next);
//        nextNode.next = head;
//        return nextNode;
//    }

    //4
//    public ListNode swapPairs(ListNode head){
//        if (head == null || head.next == null){
//            return head;
//        }
//        ListNode   nextNode = head.next;
//        head.next = swapPairs(nextNode.next);
//        nextNode.next = head;
//        return nextNode;
//    }
//    5
    public ListNode swapPairs(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
}
