// Last updated: 9/21/2026, 5:20:29 PM
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> cStack = new Stack<>();
4        Stack<String> sStack = new Stack<>();
5
6        String cString = "";
7
8        int cNum = 0;
9
10        for (char ch : s.toCharArray()) {
11            if (Character.isDigit(ch)) {
12                cNum = cNum * 10 + (ch - '0');
13            }
14            else if (ch == '[') {
15                cStack.push(cNum);
16                sStack.push(cString);
17                cNum = 0;
18                cString = "";
19            }
20
21            else if (ch == ']') {
22                int c  = cStack.pop();
23                String pString = sStack.pop();
24                StringBuilder temp = new StringBuilder();
25                for (int i = 0; i < c; i++) {
26                    temp.append(cString);
27                }
28                cString = pString+temp.toString();
29            }
30
31            else {
32                cString+=ch;
33            }
34        }
35
36        return cString;
37    }
38}