package com.chitkara.Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class RevString {
    public static void main(String[] args) {
        String s = "HELLO";
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            dq.addFirst(ch);
        }

        StringBuilder res = new StringBuilder();
        while (!dq.isEmpty()){
            res.append(dq.removeFirst());
        }

        System.out.println("Original: " + s);
        System.out.println("Reversed: " + res.toString());

        System.out.println(("Is Palindrome: " + s).equals(res.toString()));
    }
}
