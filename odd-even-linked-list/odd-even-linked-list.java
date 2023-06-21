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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next; // to append both of the list 

        while(even!=null && even.next!=null){
            odd.next = even.next;
            odd=odd.next;
            even.next=odd.next;
            even=even.next;
        
        }
        odd.next=evenHead;
        return head;
    }
}

// head.next.next one pointer incrementation 
// head.next