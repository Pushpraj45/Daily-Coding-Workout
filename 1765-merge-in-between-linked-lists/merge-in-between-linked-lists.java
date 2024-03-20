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
     public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        if(list1 == null || list2 == null){
            return null;
        }
        ListNode slow,fast;
        slow=list1;
        fast=list1;
        int k=b-a+1;
        for(int i=0;i<k;i++)
            fast=fast.next;
        
        for(int i=1;i<a;i++)
		{ 
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=list2;
        while(list2.next!=null)
            list2=list2.next;
			
        list2.next=fast.next;
        
        return list1;
    }
}