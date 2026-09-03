// Last updated: 9/3/2026, 5:35:50 PM
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
12    public void reorderList(ListNode head) {
13        if (head == null || head.next == null) {
14            return;
15        }
16
17        ListNode slow= head;
18        ListNode fast = head;
19
20        while (fast != null && fast.next != null) {
21            slow=slow.next;
22            fast=fast.next.next;
23        }
24        ListNode second = slow.next;
25        slow.next = null;
26        ListNode prev = null;
27
28        while (second != null) {
29            ListNode next = second.next;
30            second.next = prev;
31            prev=second;
32            second=next;
33        }
34        second=prev;
35        ListNode first  = head;
36        
37        while (second!=null){
38            ListNode firstNext = first.next;
39            ListNode secondNext = second.next;
40
41            first.next = second;
42            second.next = firstNext;
43            first = firstNext;
44            second = secondNext;
45        }
46        
47    }
48}