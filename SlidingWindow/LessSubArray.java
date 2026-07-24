package com.chitkara.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;

public class LessSubArray {
    public static void main(String[] args) {
        ArrayList<Integer> ress = new ArrayList<>(Arrays.asList(1, 2, 1));
        int k = 3;

        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;

        while (end < ress.size()) {
            sum += ress.get(end);

            while (sum > k) {
                sum -= ress.get(start);
                start++;
            }

            count += end - start + 1;
            end++;
        }
        System.out.println(count);
    }
}
