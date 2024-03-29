// 98. Validate Binary Search Tree
// https://leetcode.com/problems/validate-binary-search-tree/submissions/


class Solution {
    public boolean isValidBST(TreeNode root) {
        return helper(root,null,null);
    }
    
    boolean helper(TreeNode root, Integer min, Integer max){
        if(root==null){
            return true;
        }
        if(min != null && root.val <= min){
            return false;
        }
        if(max != null && root.val >= max){
            return false;
        }
        
        return helper(root.left,min,root.val) && helper(root.right,root.val,max);
    }
    
}
