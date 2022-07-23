//https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
//235. Lowest Common Ancestor of a Binary Search Tree


class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       
		if(root.val == p.val || root.val == q.val)
            return root;
       
		else if((p.val < root.val && q.val > root.val) || (q.val < root.val && p.val > root.val))
            return root;
       
	   else if(p.val < root.val && q.val < root.val)
            return lowestCommonAncestor(root.left,p,q);
        
		else
            return lowestCommonAncestor(root.right,p,q);
    }
}
