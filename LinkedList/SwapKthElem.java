package com.chitkara.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class SwapKthElem {
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

        // VIA COLLECTIONS FRAMEWORK
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(10,20,30,40,50));
        int k = 1;

        int temp = list.get(k-1);
        int last = list.get(list.size() - k);
        list.set(k-1, last);
        list.set(list.size() - k, temp);

        System.out.println(list);


//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);
//        head.next.next.next.next = new Node(50);
//
//        int k = 2;
//
//        int len= 0;
//        Node curr = head;
//
//        while (curr != null) {
//            len++;
//            curr = curr.next;
//        }
//
//        Node first = head;
//        for (int i = 1; i < k; i++) {
//            first = first.next;
//        }
//
//        Node sec = head;
//        for (int i = 1; i < len - k + 1; i++) {
//            sec = sec.next;
//        }
//
//        int temp = first.data;
//        first.data = sec.data;
//        sec.data = temp;
//
//        Node temp1 = head;
//        while (temp1 != null) {
//            System.out.print(temp1.data + " -> ");
//            temp1 = temp1.next;
//        }
//        System.out.println("null");
    }
}
