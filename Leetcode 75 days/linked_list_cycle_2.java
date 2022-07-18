// 142. Linked List Cycle II
// https://leetcode.com/problems/linked-list-cycle-ii/

public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> hs = new HashSet<ListNode>();
        
        while(head!=null){
            if(hs.contains(head.next))
                return head.next;
            else
                hs.add(head);
            
            head=head.next;
        }
        return null;
    }
}
