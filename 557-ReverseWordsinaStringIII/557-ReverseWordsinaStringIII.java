// Last updated: 9/16/2026, 3:56:36 AM
1class Solution {
2    public String reverseStr(String s, int k) {
3        String ans = "";
4
5        for (int i = 0; i < s.length(); i+=2*k) {
6            String sub = s.substring(i, Math.min(i + 2*k, s.length()));
7            
8            if (sub.length() < k) {
9                ans += new StringBuilder(sub).reverse();
10            }
11            else {
12                ans += new StringBuilder(sub.substring(0, k)).reverse();
13                ans += sub.substring(k);
14            }
15        }
16
17        return ans;
18    }
19}