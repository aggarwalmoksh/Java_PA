package com.chitkara.Circular;

import java.awt.*;

public class CLL_MiddleNode {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    static Node head = null;

    static void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while(temp.next!=head){
            temp=temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    static void findMiddle(){
        Node slow = head;
        Node fast = head;

        while (fast.next!=head && fast.next.next!=head) {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("Middle: "+ slow.data);
    }

    static Node[] split() {
        Node slow = head;
        Node fast = head;

        while (fast.next!=head && fast.next.next!=head) {
            slow=slow.next;
            fast=fast.next.next;
        }

        if (fast.next.next == head) {
            fast = fast.next;
        }

        Node head1= head;
        Node head2= slow.next;

        slow.next = head1;
        fast.next = head2;

        return new Node[]{head1, head2};
    }

    static void display(Node head) {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }
        while (temp != head);

        System.out.println();
    }



    public static void main(String[] args) {
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);

        findMiddle();

        Node[] result = split();
        Node head1 = result[0];
        Node head2 = result[1];

        display(head1);
        display(head2);



    }
}
