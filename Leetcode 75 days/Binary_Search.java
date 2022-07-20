// https://leetcode.com/problems/binary-search/
// 704. Binary Search

class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        int mid;
        
        while(l < r){
            mid = l + (r - l) / 2;

            if(nums[mid] == target) {
                return mid;
            }
            
            if(nums[mid] < target){
                l = mid + 1;
            }else{
                r = mid;
            }
        }
        
        return -1;

    }
}
