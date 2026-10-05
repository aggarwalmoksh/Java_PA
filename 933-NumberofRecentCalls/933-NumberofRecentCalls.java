// Last updated: 10/5/2026, 5:12:54 PM
1import java.util.*;
2
3class RecentCounter {
4    private Queue<Integer> queue;
5
6    public RecentCounter() {
7        this.queue = new LinkedList<>();
8    }
9    
10    public int ping(int t) {
11        queue.add(t);
12
13        while (queue.peek() < t - 3000) {
14            queue.remove();
15        }
16
17        return queue.size();
18        
19    }
20}
21
22/**
23 * Your RecentCounter object will be instantiated and called as such:
24 * RecentCounter obj = new RecentCounter();
25 * int param_1 = obj.ping(t);
26 */