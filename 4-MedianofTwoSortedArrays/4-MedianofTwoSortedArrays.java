// Last updated: 8/12/2026, 3:05:42 PM
1class Solution {
2    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
3        int n1 = nums1.length;
4        int n2 = nums2.length;
5        int n = n1+n2;
6
7        if (n1 > n2) return findMedianSortedArrays(nums2, nums1);
8        
9        int low = 0;
10        int high = n1;
11        int left = (n1+n2+1)/2;
12
13        while (low <= high) {
14            int mid1 = low + (high - low) / 2;
15            int mid2 = left - mid1;
16            int l1 = Integer.MIN_VALUE;
17            int l2 = Integer.MIN_VALUE;
18            int r1 = Integer.MAX_VALUE;
19            int r2 = Integer.MAX_VALUE;
20
21            if (mid1 < n1) r1 = nums1[mid1];
22            if (mid2 < n2) r2 = nums2[mid2];
23            if (mid1 - 1 >= 0) l1 = nums1[mid1 - 1];
24            if (mid2 - 1 >= 0) l2 = nums2[mid2 - 1];
25
26            if (l1 <= r2 && l2 <= r1) {
27                if (n%2 == 1) return Math.max(l1, l2);
28                return (double)(Math.max(l1,l2) + Math.min(r1,r2)) / 2.0;
29            }
30            else if (l1 > r2) {
31                high = mid1 - 1;
32            }
33            else {
34                low = mid1 + 1;
35            }
36        }
37        return 0;
38    }
39}