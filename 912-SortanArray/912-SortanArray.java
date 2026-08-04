// Last updated: 8/4/2026, 2:09:43 PM
1class Solution {
2    static void merge(int[] arr, int low, int mid, int high) {
3        int[] temp = new int[high-low+1];
4        int left = low;
5        int right = mid+1;
6        int k =0;
7
8        while (left <= mid && right <= high) {
9            if (arr[left] <= arr[right]){
10                temp[k] = arr[left];
11                k++;
12                left++;
13            }
14            else {
15                temp[k] = arr[right];
16                k++;
17                right++;
18            }
19        }
20
21        while (left <= mid) {
22            temp[k] = arr[left];
23            k++;
24            left++;
25        }
26        while (right <= high) {
27            temp[k] = arr[right];
28            k++;
29            right++;
30        }
31
32        for (int i = low; i <= high; i++) {
33            arr[i] = temp[i-low];
34        }
35    }
36
37    static void mergeSort(int[] arr, int low, int high) {
38        if (low >= high) {
39            return;
40        }
41        int mid = low + (high-low)/2;
42        mergeSort(arr,low,mid);
43        mergeSort(arr,mid+1, high);
44
45
46        merge(arr,low,mid,high);
47
48    }
49
50    public int[] sortArray(int[] nums) {
51        mergeSort(nums, 0, nums.length - 1);
52        return nums;
53    }
54}