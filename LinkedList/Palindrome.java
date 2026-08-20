package com.chitkara.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class Palindrome {

//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,3,1));

        int first = 0;
        int last = list.size()-1;

        while (first <= last) {
            if (list.get(first) != list.get(last)) {
                System.out.println("NOT PALINDROME");
                return;
            }
            first++;
            last--;
        }
        System.out.println("PALINDROME");


//        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(2);
//        head.next.next.next.next = new Node(1);
//
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        Node prev = null;
//        Node curr = slow;
//
//        while (curr != null) {
//            Node next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//
//        Node left = head;
//        Node right = prev;
//
//        while (right != null) {
//            if (left.data != right.data) {
//                System.out.println("NOT PALINDROME");
//                return;
//            }
//            left = left.next;
//            right = right.next;
//        }
//
//        System.out.println("PALINDROME");
    }
}