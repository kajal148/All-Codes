// https://leetcode.com/problems/longest-palindrome/
// 409. Longest Palindrome

class Solution {
    public int longestPalindrome(String s) {  
        int[] arr = new int[256];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)]++;
        }


        int count = 0;

        for (int i = 0; i < 256; i++) {
            if(count % 2 != 0 && arr[i] % 2  != 0){
                    count += arr[i] - 1;
                }else{
                    count += arr[i];
            }
        }
        
        return count;
    }
}
