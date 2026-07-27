// Last updated: 7/24/2026, 6:01:37 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0;
4        int high = nums.length - 1;
5
6        while (low <= high) {
7            int mid = low + (high - low)/2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12            else if (nums[mid] < target) {
13                low = mid+1;
14            }
15            else {
16                high=mid-1;
17            }
18        }
19        return -1;
20    }
21}