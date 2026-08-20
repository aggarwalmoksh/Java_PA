package com.chitkara.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class ReverseAlternateK {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int k = 3;

        for (int i = 0; i < list.size(); i += k) {
            if (i + k > list.size()) {
                break;
            }
            int temp;
            temp = list.get(i);
            list.set(i, list.get(i+1));
            list.set(i+1, temp);

            i+=2;
        }
        System.out.println(list);
    }
}
