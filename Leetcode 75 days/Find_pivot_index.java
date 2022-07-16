// Find Pivot Index - 724
// Link - https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1){
            return 0;
        }
        
        int sum = 0;
    
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
        }
        
        int right_sum = sum;
        int left_sum = 0;

        for(int i=0;i<nums.length;i++){
            right_sum = right_sum - nums[i];
            
            if(right_sum == left_sum){
                return i;
            }
            
            left_sum = left_sum + nums[i];
        }
        
        
        return -1;
    }
}
