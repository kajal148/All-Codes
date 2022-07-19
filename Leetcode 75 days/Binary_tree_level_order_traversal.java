// https://leetcode.com/problems/binary-tree-level-order-traversal/
// 102. Binary Tree Level Order Traversal

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> q = new LinkedList<>();
        // result.add(new ArrayList<>(Arrays.asList(root.val)));
        q.offer(root);
        
        while(!q.isEmpty()){
            List<Integer> temp = new ArrayList<Integer>();
            int size = q.size();
            
            while(size --> 0){
                TreeNode val = q.poll();
                temp.add(val.val);
                
                if(val.left != null){
                    q.offer(val.left);
                }
                if(val.right != null){
                    q.offer(val.right);
                }
            }
            
            result.add(temp);
        }
        
        return result;
    }
}
