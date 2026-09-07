// Last updated: 9/7/2026, 4:29:09 PM
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
12    public ListNode partition(ListNode head, int x) {
13        ListNode smallDummy = new ListNode(0);
14        ListNode bigDummy = new ListNode(0);
15
16        ListNode small = smallDummy;
17        ListNode big = bigDummy;
18
19        ListNode curr = head;
20
21        while (curr!=null){
22            if (curr.val < x) {
23                small.next = curr;
24                small=small.next;
25            }
26            else {
27                big.next = curr;
28                big=big.next;
29            }
30            curr=curr.next;
31        }
32
33        big.next=null;
34        small.next = bigDummy.next;
35
36        return smallDummy.next;
37    }
38}