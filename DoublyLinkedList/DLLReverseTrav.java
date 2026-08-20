package com.chitkara.DoublyLinkedList;

public class DLLReverseTrav {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    static void Reverse(Node head) {
        Node curr = head;

        while (curr.next!=null) {
            curr=curr.next;
        }

        while (curr!=null) {
            System.out.print(curr.data + " ");
            curr=curr.prev;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        Node fifth = new Node(50);

        head.next = second;
        second.prev = head;
        second.next=third;
        third.prev=second;
        third.next=fourth;
        fourth.prev=third;
        fourth.next=fifth;
        fifth.prev=fourth;

        Reverse(head);
    }
}
