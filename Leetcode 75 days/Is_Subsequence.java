//392. Is Subsequence
//Link - https://leetcode.com/problems/is-subsequence/

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int sLen = s.length();
        int tLen = t.length();
        
        //edge case
        if(sLen == 0){
            return true;
        }
        
        if(tLen == 0){
            return false;
        }
        
       
        
        if(sLen > tLen){
            return false;
        }
    
        int i = 0, j = 0, count = 0;
        
        
        while(i < sLen && j < tLen){
            if(s.charAt(i) == t.charAt(j)){
                count++;
                i++;
            }
            j++;
        }
        
        return count == sLen ? true : false;
    }
}
