// Last updated: 9/16/2026, 3:14:33 AM
1class Solution {
2    public String reverseWords(String s) {
3        String[] words = s.split("\\s+");
4        String ans = "";
5        for (int i = words.length-1; i>=0; i--) {
6            ans += words[i] + " ";
7        }
8
9        return ans.trim();
10    }
11}