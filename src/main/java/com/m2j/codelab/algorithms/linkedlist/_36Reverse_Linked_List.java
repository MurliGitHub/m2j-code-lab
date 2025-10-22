package com.m2j.codelab.algorithms.linkedlist;

import java.util.List;

public class _36Reverse_Linked_List {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        print(head);

		ListNode revrs = reverseList(head);

		System.out.println("Reversed List:");
		print(revrs);

        head = reverseListR(head);

        System.out.println("Reversed List using recursion:");
        print(head);
    }

    public static ListNode reverseList(ListNode head) {

        if(head==null || head.next==null){
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }

      return prev;
    }

    private static ListNode reverseListR(ListNode list) {
        if (list == null) return null; // first question

        if (list.next == null) return list; // second question

        // third question - in Lisp this is easy, but we don't have cons
        // so we grab the second element (which will be the last after we reverse it)

        ListNode secondElem = list.next;

        // bug fix - need to unlink list from the rest or you will get a cycle
        list.next = null;

        // then we reverse everything from the second element on
        ListNode reverseRest = reverseListR(secondElem);

        // then we join the two lists
        secondElem.next = list;

        return reverseRest;
    }

    public static void print(ListNode resp) {
        while (resp != null) {
            System.out.print(resp.val + " ");
            resp = resp.next;
        }
        System.out.println();

    }


}
