package com.chitkara.LinkedList;

public class LinkedListSearch {
        static class Node {
            int data;
            Node next;

            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        static void SearchElement(Node head, int target) {
            Node curr = head;
            int pos = 1;

            while (curr != null) {
                if (curr.data == target) {
                    System.out.println("Element found at position: " + pos);
                    return;
                }
                curr=curr.next;
                pos++;
            }

            System.out.println("Element not found!");
        }

    public static void main(String[] args) {

    }


}
