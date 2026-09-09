// Last updated: 9/10/2026, 3:12:18 AM
1class Solution {
2    public String shiftingLetters(String s, int[] shifts) {
3        StringBuilder sb = new StringBuilder(s);
4        long shift = 0;
5
6        for (int i = s.length() - 1; i >= 0; i--) {
7            shift += shifts[i];
8            sb.setCharAt(i, (char)((s.charAt(i) - 'a' + shift % 26) % 26 + 'a'));
9        }
10        return sb.toString();
11    }
12}