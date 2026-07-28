// Last updated: 7/29/2026, 1:56:25 AM
1class Solution {
2    public void merge(int[] nums1, int m, int[] nums2, int n) {
3        int left = m - 1;
4        int right = n - 1;
5        int k = m + n - 1;
6
7        while (left >= 0  && right >= 0) {
8            if (nums1[left] < nums2[right]){
9                nums1[k] = nums2[right];
10                right--;
11                k--;
12            }
13            else {
14                nums1[k] = nums1[left];
15                k--;
16                left--;
17            }
18        }
19
20        while (right >= 0) {
21            nums1[k] = nums2[right];
22            k--;
23            right--;
24        }
25    }
26}