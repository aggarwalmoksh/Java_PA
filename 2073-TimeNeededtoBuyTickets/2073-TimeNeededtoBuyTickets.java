// Last updated: 10/8/2026, 5:23:43 PM
1class Solution {
2    public int timeRequiredToBuy(int[] tickets, int k) {
3        Queue<Integer> q = new LinkedList<>();
4        int time = 0;
5
6        for (int i = 0; i < tickets.length; i++) {
7            q.add(i);
8        }
9
10        while (!q.isEmpty()) {
11            int person = q.poll();
12            tickets[person]--;
13            time++;
14
15            if (person==k && tickets[person] == 0) {
16                break;
17            }
18
19            if (tickets[person] > 0) {
20                q.add(person);
21            }
22        }
23
24        return time;
25    }
26}