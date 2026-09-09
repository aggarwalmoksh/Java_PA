// Last updated: 9/10/2026, 2:44:11 AM
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
12    public ListNode sortList(ListNode head) {
13        if (head == null || head.next == null) {
14            return head;
15        }
16
17        ListNode middle = findMiddle(head);
18        ListNode leftHead = head;
19        ListNode rightHead = middle.next;
20        middle.next = null;
21
22        leftHead = sortList(leftHead);
23        rightHead = sortList(rightHead);
24
25        return merge(leftHead, rightHead);
26    }
27
28    ListNode findMiddle(ListNode head){
29        ListNode slow = head;
30        ListNode fast = slow.next;
31
32        while (fast != null && fast.next != null) {
33            slow = slow.next;
34            fast = fast.next.next;
35        }
36
37        return slow;
38    }
39
40    ListNode merge(ListNode left, ListNode right) {
41        if (left == null) return right;
42        if (right == null) return left;
43
44        if (left.val < right.val) {
45            left.next =  merge(left.next, right);
46            return left;
47        }
48        else {
49            right.next = merge(left, right.next);
50            return right;
51        }
52    }
53}