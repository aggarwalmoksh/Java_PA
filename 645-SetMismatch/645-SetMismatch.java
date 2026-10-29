// Last updated: 10/30/2026, 1:12:28 AM
1class Solution {
2    public int[] findErrorNums(int[] nums) {
3        int[] count = new int[nums.length+1];
4
5        for (int num : nums) {
6            count[num]++;
7        }
8
9        int[] res = new int[2];
10        for (int  i = 1; i <= nums.length; i++) {
11            if (count[i] == 2) {
12                res[0] = i;
13            }
14            else if (count[i] == 0) {
15                res[1] = i;
16            }
17        }
18
19        return res;
20
21    }
22}