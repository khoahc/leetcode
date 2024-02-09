/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        // C1
        // s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // int lengthStr = s.length();
        // for (int i = 0; i < lengthStr / 2; ++i) {
        //     if (s.charAt(i) != s.charAt(lengthStr - 1 - i)) {
        //         return false;
        //     }
        // }
        // return true;

        // C2
        if (s.isEmpty()) {
            return true;
        }

        int left = 0, right = s.length() - 1;

        while (left < right) {
            char currentLeft = s.charAt(left);
            char currentRight = s.charAt(right);
            if (!Character.isLetterOrDigit(currentLeft)) {
                left++;            
            } else if (!Character.isLetterOrDigit(currentRight)) {
                right--;
            } else {
                if (Character.toLowerCase(currentLeft) != Character.toLowerCase(currentRight)) {
                    return false;
                }
                left++;
                right--;
            }
        }

        return true;
    }
}
// @lc code=end

