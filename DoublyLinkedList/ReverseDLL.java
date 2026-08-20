package com.chitkara.DoublyLinkedList;

import javax.management.NotificationEmitter;
import java.util.Currency;

public class ReverseDLL {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    static Node reverse(Node head){
        Node curr = head;

        Node newHead = null;

        while (curr!=null) {
            Node temp = curr.prev;
            curr.prev=curr.next;
            curr.next = temp;
            newHead = curr;
            curr = curr.prev;
        }

        return newHead;
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

        head = reverse(head);
        printForward(head);
    }
}
