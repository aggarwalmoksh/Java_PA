package com.chitkara.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Palindome {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        s1 = s1.toLowerCase();
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            dq.addFirst(ch);
        }

        StringBuilder s2 = new StringBuilder();
        while (!dq.isEmpty()){
            s2.append(dq.removeFirst());
        }

        System.out.println("Is Palindrome: " + s1.contentEquals(s2));
    }
}
