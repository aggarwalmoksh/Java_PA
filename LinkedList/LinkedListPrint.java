package com.chitkara.LinkedList;

import javax.xml.crypto.Data;

    public class LinkedListPrint {
        static class Node {
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
     }

     public static void printLL(Node head) {
        Node temp = head;

        while (temp!= null) {
            System.out.print(temp.data + "->");
            temp=temp.next;
        }
     }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        printLL(head);
    }
}
