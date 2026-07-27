// Last updated: 7/27/2026, 5:10:36 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12            if (nums[left] <= nums[mid]){
13                if (nums[left] <= target && target < nums[mid]) right = mid - 1;
14                else left = mid  + 1;
15            } else {
16                if (nums[mid] < target && target <= nums[right]) left = mid + 1;
17                else right = mid - 1;
18            }
19        }
20
21        return -1;
22    }
23}