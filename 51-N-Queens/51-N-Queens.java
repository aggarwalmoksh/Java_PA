// Last updated: 9/11/2026, 5:32:37 PM
1class Solution {
2    public List<List<String>> solveNQueens(int n) {
3        List<List<String>> ans = new ArrayList<>();
4        char[][] board = new char[n][n];
5
6        for (int i = 0; i < n; i++) {
7            Arrays.fill(board[i], '.');
8        }
9
10        solve(0,n,board,ans);
11        return ans;
12    }
13
14    private void solve(int row, int n, char[][] board, List<List<String>> ans){
15        if (row == n) {
16            List<String> list = new ArrayList<>();
17            for (int i = 0; i < n; i++) {
18                list.add(new String(board[i]));
19            }
20
21            ans.add(list);
22            return;
23        }
24
25        for (int col = 0; col < n; col++) {
26            if (isSafe(row, col, n, board)) {
27                board[row][col] = 'Q';
28                solve(row+1,n,board,ans);
29                board[row][col] = '.';
30            }
31        }
32    }
33
34    private boolean isSafe(int row, int col, int n, char[][] board) {
35        for (int i = 0; i < row; i++) {
36            if (board[i][col] == 'Q') {
37                return false;
38            }
39        }
40
41        int i = row-1;
42        int j = col-1;
43
44        while (i >= 0 && j >= 0){
45            if (board[i][j] == 'Q') {
46                return false;
47            }
48            i--;
49            j--;
50        }
51
52        i = row-1;;
53        j = col+1;
54
55        while (i >= 0 && j < n) {
56            if (board[i][j] == 'Q') {
57                return false;
58            }
59            i--;
60            j++;
61        }
62
63        return true;
64    }
65}