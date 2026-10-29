// Last updated: 10/30/2026, 1:02:01 AM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int maxCount= 0;
4
5        int left = 0;
6        int right = 0;
7        int count = 0;
8
9        while (right < nums.length) {
10            if (nums[right] == 0) {
11                maxCount = Math.max(count, maxCount);
12                right++;
13                left = right;
14                count = 0;
15            }
16            else{
17                count++;
18                right++;
19            } 
20        }
21        maxCount = Math.max(count, maxCount);
22        return maxCount;
23    }
24}