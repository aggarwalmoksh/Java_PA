package com.chitkara.LinkedList;

public class LinkedListMiddle {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            Node next = null;
        }
    }

    public static int middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow.value;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println(middleNode(head));
    }
}
