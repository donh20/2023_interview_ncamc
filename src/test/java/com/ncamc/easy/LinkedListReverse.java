package com.ncamc.easy;

import org.junit.Test;

import java.util.List;

public class LinkedListReverse {


    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

//        ListNode node = head;
//        while(node!=null){
//            System.out.println(node.val);
//            node = node.next;
//        }
        ListNode node1 = reverseList(head);
        while(node1!=null){
            System.out.println(node1.val);
            node1 = node1.next;
        }
    }
    public static ListNode reverseList(ListNode node) {
        ListNode prev = null;
        ListNode cur = node;

        while (cur!=null) {
            //得取cur和nextNode俩节点,挨个往前挪
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
