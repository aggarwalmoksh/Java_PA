// Last updated: 8/7/2026, 2:20:35 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        while (!check(n, t)) {
4            n++;
5        }
6        return n;
7    }
8    static boolean check(int n, int t) {
9        int product = 1;
10
11        while (n > 0) {
12            product *= (n%10);
13            n = n / 10;
14            if (product == 0) {
15                break;
16            }
17        }
18        return (product%t == 0);
19    }
20}