// 21. Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null && list2 == null){
            return list1;
        }else if(list1 == null){
            return list2;
        }else if(list2 == null){
            return list1;
        }
        
        ListNode head = new ListNode(0);
        ListNode temp = head;
        
        
        
        while(list1 != null && list2 != null){
            if(list1.val > list2.val){
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }else{
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            }
        }
        
        while(list1 != null){
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        
        while(list2 != null){
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        
        return head.next;
    }
}
