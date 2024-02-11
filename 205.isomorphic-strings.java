//Given two strings s and t, determine if they are isomorphic. 
//
// Two strings s and t are isomorphic if the characters in s can be replaced to 
//get t. 
//
// All occurrences of a character must be replaced with another character while 
//preserving the order of characters. No two characters may map to the same 
//character, but a character may map to itself. 
//
// 
// Example 1: 
// Input: s = "egg", t = "add"
//Output: true
// 
// Example 2: 
// Input: s = "foo", t = "bar"
//Output: false
// 
// Example 3: 
// Input: s = "paper", t = "title"
//Output: true
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 5 * 10⁴ 
// t.length == s.length 
// s and t consist of any valid ascii character. 
// 
//
// Related Topics Hash Table String 👍 8104 👎 1894


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] countSArr = new int[128];
        int[] countTArr = new int[128];

        for (int i = 0; i < s.length(); i++) {
            char iS = s.charAt(i);
            char iT = t.charAt(i);

            if (countSArr[iS] != countTArr[iT]) {
                return false;
            }

            countSArr[iS] = i + 1;
            countTArr[iT] = i + 1;
        }

        return true;
    }
}

// @lc code=end

