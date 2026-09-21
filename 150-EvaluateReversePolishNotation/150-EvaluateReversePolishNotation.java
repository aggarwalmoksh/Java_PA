// Last updated: 9/21/2026, 4:31:14 PM
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack<Integer> st = new Stack<>();
4
5        for (String t : tokens) {
6            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {
7                int b = st.pop();
8                int a = st.pop();
9
10                int result = 0;
11
12                if (t.equals("+")) {
13                    result = a+b;
14                }
15                else if (t.equals("-")) {
16                    result = a-b;
17                }
18                else if (t.equals("*")) {
19                    result = a*b;
20                }
21                else {
22                    result = a/b;
23                }
24
25                st.push(result);
26            }
27
28            else {
29                st.push(Integer.parseInt(t));
30            }
31        }
32
33        return st.pop();
34    }
35}