package com.chitkara.SlidingWindow;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class LeastMinimumSum {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(2,3,1,2,4,3));
        int k = 7;
        int start = 0;
        int end = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        while (end < arr.size()) {
            sum += arr.get(end);

            while (sum >= k) {
                minLen = Math.min(minLen, end - start + 1);
                sum-=arr.get(start);
                start++;
            }
            end++;
        }
        if (minLen == Integer.MAX_VALUE) {
            System.out.println(0);
        }
        else{
            System.out.println(minLen);
        }
    }
}
