// 206. Reverse Linked List
// https://leetcode.com/problems/reverse-linked-list/

class Solution {
    ListNode tail=null; 
    
    public ListNode reverseList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        helper(head, null);
        
        return tail;
        
    }
    
    public void helper(ListNode curr, ListNode prev){
        if(curr.next == null){
            tail = curr;
        }else{
            helper(curr.next, curr);   
        }
        
        curr.next = prev;
    }
}
