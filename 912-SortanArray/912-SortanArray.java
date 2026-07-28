// Last updated: 7/29/2026, 1:46:34 AM
1class Solution {
2    public void sortColors(int[] nums) {
3        int low = 0;
4        int mid = 0;
5        int high = nums.length - 1;
6
7        while (mid <= high) {
8            if (nums[mid] == 0) {
9                int temp = nums[mid];
10                nums[mid] = nums[low];
11                nums[low] = temp;
12
13                low++;
14                mid++;
15            }
16            else if (nums[mid] == 1) {
17                mid++;
18            }
19            else {
20                int temp = nums[mid];
21                nums[mid] = nums[high];
22                nums[high] = temp;
23                high--;
24            }
25        }
26    }
27}