// Last updated: 9/10/2026, 3:48:05 AM
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
16            if (curr == null) {
17                return head;
18            }
19            curr = curr.next;
20        }
21
22        ListNode prev = null;
23        curr = head;
24
25        for (int i = 0; i < k; i++) {
26            ListNode next = curr.next;
27            curr.next = prev;
28            prev = curr;
29            curr = next;
30        }
31
32        head.next = reverseKGroup(curr, k);
33
34        return prev;
35    }
36    
37}