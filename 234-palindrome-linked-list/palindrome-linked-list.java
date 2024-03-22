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
     public ListNode FindMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next;  //+2

        }
        return slow;// slow is my MidNode
    }
    public boolean isPalindrome(ListNode head) {
             if (head==null || head.next==null){
            return true;
        }
//        Step-1 findMid Node
        ListNode midNode=FindMid(head);
//        Step-2 Reverse 2nd half
        ListNode prev=null;
        ListNode curr=midNode;
        ListNode next;
        while (curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ListNode right=prev; //right half head
        ListNode left=head;

//        Step-3 Check left and right half
        while (right!=null){
            if (left.val!= right.val){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }
}