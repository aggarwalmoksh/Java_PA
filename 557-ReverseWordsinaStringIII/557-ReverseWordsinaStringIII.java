// Last updated: 9/16/2026, 3:23:10 AM
1import java.util.StringTokenizer;
2
3class Solution {
4    public String reverseWords(String s) {
5        StringBuilder sb = new StringBuilder();
6        StringTokenizer st = new StringTokenizer(s);
7
8        while (st.hasMoreTokens()) {
9            String word = st.nextToken();
10            sb.append(new StringBuilder(word).reverse());
11            if (st.hasMoreTokens()) {
12                sb.append(" ");
13            }
14        }
15
16        return sb.toString();
17    }
18}