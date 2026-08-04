package Sorting;

public class KthSmallestElementSelSort {
    public static int KthSmallestElement(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int ans = KthSmallestElement(arr, 2);
        System.out.println(ans);
    }
}

