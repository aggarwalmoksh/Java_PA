// Last updated: 7/29/2026, 2:09:25 AM
1class Solution {
2    public String[] sortPeople(String[] names, int[] heights) {
3        for (int i = 0; i < heights.length - 1; i++) {
4            int max = i;
5            for (int j = i + 1; j < heights.length; j++) {
6                if (heights[j] > heights[max]) {
7                    max = j;
8                }
9            }
10            String temp1 = names[max];
11            int temp2 = heights[max];
12            names[max] = names[i];
13            heights[max] = heights[i];
14            names[i] = temp1;
15            heights[i] = temp2;
16        }
17        return names;
18    }
19}