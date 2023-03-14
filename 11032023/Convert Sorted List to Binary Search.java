class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);
        ListNode middle = getMiddle(head);
        TreeNode root = new TreeNode(middle.val);
        root.right = sortedListToBST(middle.next);
        middle.next =null;
        root.left = sortedListToBST(head);
        return root;
    }
    
    public ListNode getMiddle(ListNode head){
        //if(head == null || head.next==null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
            
        }
        if(prev!=null)prev.next =null;
        return slow;
    }
}