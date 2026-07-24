// Last updated: 7/21/2026, 2:52:15 AM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> hs = new HashSet<>();
4
5        int left =0;
6        int right = 0;
7        int maxLen = 0;
8
9        while (right < s.length()) {
10            char ch = s.charAt(right);
11            while (hs.contains(ch)){
12                hs.remove(s.charAt(left));
13                left++;
14            }
15            hs.add(ch);
16            right++;
17            maxLen = Math.max(maxLen, right-left);
18        }
19        return maxLen;
20    }
21}