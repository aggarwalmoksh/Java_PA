// Last updated: 10/5/2026, 5:27:48 PM
1class Solution {
2    public int countStudents(int[] students, int[] sandwiches) {
3        Queue<Integer> q = new LinkedList<>();
4
5        for (int s : students) {
6            q.offer(s);
7        }
8
9        int sI = 0;
10        int rot= 0;
11
12        while (!q.isEmpty() && rot < q.size()) {
13            if (q.peek() == sandwiches[sI]) {
14                q.poll();
15                sI++;
16                rot = 0;
17            }
18            else {
19                q.add(q.poll());
20                rot++; 
21            }
22        }
23
24        return q.size();
25    }
26}