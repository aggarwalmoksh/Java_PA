// Last updated: 9/10/2026, 2:35:25 PM
1class Solution {
2    public String shiftingLetters(String s, int[] shifts) {
3        StringBuilder sb = new StringBuilder(s);
4        long shift = 0;
5        for (int i = s.length() - 1; i >= 0; i--) {
6            shift += shifts[i];
7            sb.setCharAt(i, 
8                (char)((s.charAt(i) - 'a' + shift % 26) % 26 + 'a')
9            );
10        }
11        return sb.toString();
12    }
13}