// Last updated: 9/10/2026, 2:22:59 PM
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        if (list1 == null) return list2;
14        if (list2 == null) return list1;
15
16        if (list1.val < list2.val) {
17            list1.next = mergeTwoLists(list1.next , list2);
18            return list1;
19        }
20        else {
21            list2.next = mergeTwoLists(list1 , list2.next);
22            return list2;
23        }
24    }
25}