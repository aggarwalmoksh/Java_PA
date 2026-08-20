package com.chitkara.LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class SwapAdjElem {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(10,9,11,19));
        int temp;
        for (int i = 0; i < linkedList.size() - 1; i+=2){
            temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(i+1));
            linkedList.set(i+1, temp);
        }

        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i));
            if (i != linkedList.size() - 1) {
                System.out.print(" -> ");
            }
        }

    }
}
