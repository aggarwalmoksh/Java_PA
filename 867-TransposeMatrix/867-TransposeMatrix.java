// Last updated: 7/29/2026, 2:35:03 AM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int n = matrix.length;
4        int m = matrix[0].length;
5
6        int[][] res = new int[m][n];
7
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                res[i][j] = matrix[j][i];
11            }
12        }
13        return res;
14
15    }
16}