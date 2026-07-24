package com.chitkara.Searching;

public class total_occurences {

    static int first_occurences(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid-1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    static int last_occurences(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid+1;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,3,4,5};
        int target = 2;
        int first = first_occurences(arr, target);
        int last = last_occurences(arr, target);

        if (first == -1) {
            System.out.println("Element not found");
        }
        else {
            System.out.println("Count: " + (last-first+1));
        }
    }
}
