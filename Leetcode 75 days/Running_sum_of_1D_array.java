// Running sum of 1d array - 1480
//Link https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        if(len == 0 || len == 1){
            return nums;
        }
        
        for(int i = 1; i < len ; i++){
            nums[i] = nums[i] + nums[i-1];
        }
        
        return nums;
    }
}
