// Last updated: 9/14/2026, 5:31:28 PM
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        int[] result = new int[temperatures.length];
4        Stack<Integer> st = new Stack<>();
5
6        for (int i=0; i < temperatures.length; i++) {
7
8            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
9                int prev = st.pop();
10                result[prev] = i - prev;
11            }
12
13            st.push(i);
14        }
15
16        return result;
17        
18    }
19}