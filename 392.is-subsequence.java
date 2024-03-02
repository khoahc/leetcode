/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int lengthS = s.length();
        int lengthT = t.length();

        if (lengthS > lengthT) return false;
        if (lengthS == 0) return true;
        
        int indexS = 0, indexT = 0;

        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();

        while (indexT < lengthT && indexS < lengthS) {
            if (tArray[indexT] == sArray[indexS]) {
                indexS++;            
            } 
            indexT++;    
        }

        return indexS == lengthS;      
    }
}
// @lc code=end

