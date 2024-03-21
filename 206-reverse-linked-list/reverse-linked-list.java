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
    public static ListNode head;
    public static ListNode tail;
    public ListNode reverseList(ListNode head) {
        ListNode prev=null;
        ListNode curr=tail=head; // Right to left assignment in java
        ListNode next;   // 3 variables 4 steps
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return prev;
    }
}