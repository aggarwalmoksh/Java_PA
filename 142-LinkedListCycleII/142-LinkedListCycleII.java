// Last updated: 9/3/2026, 6:08:26 PM
1/**
2 * Definition for singly-linked list.
3 * class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode detectCycle(ListNode head) {
14        ListNode slow = head;
15        ListNode fast = head;
16
17        while (fast != null && fast.next != null) {
18            fast = fast.next.next;
19            slow = slow.next;
20
21            if (slow == fast) {
22                break;
23            }
24        }
25
26        if (fast == null || fast.next == null) {
27            return null;
28        }
29
30        slow = head;
31
32        while (slow != fast) {
33            slow= slow.next;
34            fast=fast.next;
35        }
36        return slow;
37
38    }
39}