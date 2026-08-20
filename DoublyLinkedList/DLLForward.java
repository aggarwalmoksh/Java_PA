package com.chitkara.DoublyLinkedList;

public class DLLForward {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            next = null;
            prev = null;
        }
    }

    static void printForward(Node head) {
        Node temp= head;
        while (temp!=null) {
            System.out.print(temp.data+ " ");
            temp=temp.next;
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

        printForward(head);
    }
}
