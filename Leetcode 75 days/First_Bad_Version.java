// https://leetcode.com/problems/first-bad-version/
// 278. First Bad Version

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int l = 0;
        int r = n;
        int mid, ans = -1;
        
        while(l <= r){
            mid = l + (r-l)/2;
            
            if(isBadVersion(mid) == true){
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
            
        }
        
        return ans;
    }
}
