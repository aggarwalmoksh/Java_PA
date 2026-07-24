// Last updated: 7/21/2026, 2:36:53 AM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        ArrayList<Integer> order = new ArrayList<>();
4
5        int top = 0;
6        int bottom = matrix.length;
7        int left = 0;
8        int right = matrix[0].length;
9
10        while (top < bottom && left < right) {
11
12            // Top 
13            for (int i = left; i < right; i++) {
14                order.add(matrix[top][i]);
15            }
16            top++;
17
18            // Right 
19            for (int i = top; i < bottom; i++) {
20                order.add(matrix[i][right - 1]);
21            }
22            right--;
23
24            // Bottom 
25            if (top < bottom) {
26                for (int i = right - 1; i >= left; i--) {
27                    order.add(matrix[bottom - 1][i]);
28                }
29                bottom--;
30            }
31
32            // Left 
33            if (left < right) {
34                for (int i = bottom - 1; i >= top; i--) {
35                    order.add(matrix[i][left]);
36                }
37                left++;
38            }
39        }
40
41        return order;
42    }
43}