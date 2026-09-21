// Last updated: 9/21/2026, 4:58:24 PM
1class Solution {
2    public String simplifyPath(String path) {
3        Stack<String> st = new Stack<>();
4        String[] folders = path.split("/");
5
6        for (String folder : folders) {
7            if (folder.equals(".") || folder.equals("")) {
8                continue;
9            }
10            else if (folder.equals("..")) {
11                if (!st.isEmpty()) {
12                    st.pop();
13                }
14            }
15            else {
16                st.push(folder);
17            }
18        }
19
20        StringBuilder sb = new StringBuilder();
21
22        for (String f : st) {
23            sb.append("/");
24            sb.append(f);
25        }
26
27        if (sb.length() == 0) {
28            return "/";
29        }
30
31        return sb.toString();
32
33        
34
35        
36    }
37}