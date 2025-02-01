/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode a= new ListNode(0,head);
        ListNode b=a;
        ListNode c=a;

        while(c.next!=null && c.next.next!=null){
            b=b.next;
            c=c.next.next;
        }
        b.next=b.next.next;
        return a.next;
    }
}