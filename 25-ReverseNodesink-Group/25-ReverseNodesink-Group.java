// Last updated: 9/10/2026, 4:52:19 PM
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode curr = head;
14
15        for (int i = 0; i < k; i++) {
16            if (curr == null) return head;
17
18            curr = curr.next;
19        }
20
21        ListNode prev = null;
22        curr = head;
23
24        for (int i=0; i < k; i++) {
25            ListNode next = curr.next;
26            curr.next = prev;
27            prev=curr;
28            curr=next;
29        }
30
31        head.next = reverseKGroup(curr, k);
32
33        return prev;
34    }
35    
36}