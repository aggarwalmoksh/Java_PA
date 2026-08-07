// Last updated: 8/7/2026, 5:25:29 PM
1class Solution {
2    public int climbStairs(int n) {
3        if (n == 1) {
4            return 1;
5        }
6        if (n == 2) {
7            return 2;
8        }
9
10        int first_number = 1;
11        int second_number = 2;
12
13        for (int i = 3; i <= n; i++) {
14            int curr = first_number + second_number;
15            first_number = second_number;
16            second_number = curr;
17        } 
18
19        return second_number;
20    }
21}