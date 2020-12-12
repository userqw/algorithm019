package week1PPT题目;

import javax.swing.*;
import java.util.List;

//反转链表
//https://leetcode-cn.com/problems/reverse-linked-list/submissions/
public class ReverseList {
//    迭代法
//    1
//     public ListNode reverseList(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr != null) {
//            ListNode nextTemp = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextTemp;
//        }
//        return prev;
//    }

//    2
//    public ListNode reverseList(ListNode head){
//        ListNode prev =null;
//        ListNode curr = head;
//        while (curr!=null){
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return  prev;
//    }

//    3
//    public ListNode reverseList(ListNode head){
//        ListNode prev= null;
//        ListNode curr = head;
//        while (curr!=null){
//            ListNode  next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return  prev;
//    }

//    4
//    public ListNode reverseList(ListNode head){
//        ListNode prev = null;
//        ListNode curr = head;
//
//        while (curr!= null){
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }

    //5
//    public ListNode reverseList(ListNode head){
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr!=null){
//            ListNode nextNode = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nextNode;
//        }
//        return prev;
//    }

//    6
//    public ListNode reversList(ListNode head){
//        ListNode prev = null;
//        ListNode curr = head;
//        while (curr!=null){
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//
//    }

    //    7
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
