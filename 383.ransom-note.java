//Given two strings ransomNote and magazine, return true if ransomNote can be 
//constructed by using the letters from magazine and false otherwise. 
//
// Each letter in magazine can only be used once in ransomNote. 
//
// 
// Example 1: 
// Input: ransomNote = "a", magazine = "b"
//Output: false
// 
// Example 2: 
// Input: ransomNote = "aa", magazine = "ab"
//Output: false
// 
// Example 3: 
// Input: ransomNote = "aa", magazine = "aab"
//Output: true
// 
// 
// Constraints: 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote and magazine consist of lowercase English letters. 
// 
//
// Related Topics Hash Table String Counting 👍 4786 👎 487


import java.util.HashMap;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (magazine.length() < ransomNote.length()) {
            return false;
        }

//        HashMap<Character, Integer> magazineLetters = new HashMap<>();   // k = 26
//
//        for (char m : magazine.toCharArray()) {
//            magazineLetters.put(m, magazineLetters.getOrDefault(m, 0) + 1);
//        }
//
//        for (char r: ransomNote.toCharArray()) {
//            int currentCount = magazineLetters.getOrDefault(r, 0);
//
//            if (currentCount == 0) {
//                return false;
//            }
//
//            magazineLetters.put(r, --currentCount);
//        }
//        return true;


        HashMap<Character, Integer> magazineLetters = new HashMap<>();   // k = 26

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);
            magazineLetters.put(m, magazineLetters.getOrDefault(m, 0) + 1);
        }

        for (char r: ransomNote.toCharArray()) {
            int currentCount = magazineLetters.getOrDefault(r, 0);

            if (currentCount == 0) {
                return false;
            }

            magazineLetters.put(r, --currentCount);
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
