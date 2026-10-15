// Last updated: 10/15/2026, 6:15:45 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeKLists(ListNode[] lists) {
13        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) -> Integer.compare(a.val,b.val));
14        for (ListNode node : lists) {
15            if (node!=null) {
16                pq.offer(node);
17            }
18        }
19        ListNode dummy = new ListNode(0);
20        ListNode tail = dummy;
21
22        while (!pq.isEmpty()) {
23            ListNode s = pq.poll();
24            tail.next = s;
25            tail = tail.next;
26
27            if (s.next != null) {
28                pq.offer(s.next);
29            }
30        }
31        return dummy.next;
32    }
33}