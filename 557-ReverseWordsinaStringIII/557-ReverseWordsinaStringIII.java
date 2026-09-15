// Last updated: 9/16/2026, 3:26:50 AM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split(" ");
4        String ans = "";
5
6        for (String word : words) {
7            ans += new StringBuilder(word).reverse() + " ";
8        }
9
10        return ans.trim();
11    }
12}