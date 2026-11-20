package com.chitkara.Queue;

import java.util.PriorityQueue;

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
}
