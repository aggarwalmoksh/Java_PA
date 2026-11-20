package com.chitkara.Queue;

class Queue {
    int[] arr;
    int front;
    int rear;
    int size;

    Queue(int size) {
        this.size = size;
        arr= new int[size];
        front = -1;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
        }

        rear++;
        arr[rear] = value;
        System.out.println(value + " inserted");
    }

    void dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return;
        }
        System.out.println(arr[front] + " removed");
        front++;
    }


    void peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
            return;
        }
        System.out.println("Front Element " + arr[front]);
    }

    void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Empty");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

public class QDS {
    public static void main(String[] args) {
        // Queue Data Structure
        Queue q = new Queue(5);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);

        q.display();

        q.dequeue();

        q.display();

        q.peek();

    }
}
