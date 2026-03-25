/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //return solve1(strs);
        return solve2(strs);
    }

    public List<List<String>> solve1(String[] strs) {
        // Time Complexity: O(n × k log k)

        // n = number of strings in the input array
        // k = maximum length of a string
        // For each string: sorting characters takes O(k log k)
        // HashMap operations (containsKey, put, get, add) are O(1) average case
        // Overall: O(n) iterations × O(k log k) per iteration
        // Space Complexity: O(n × k)

        // The HashMap stores all input strings as key-value pairs: O(n × k)
        // The result list contains all strings: O(n × k)
        // Temporary char arrays use O(k) at a time (reused, not cumulative)
        // Total auxiliary space is proportional to the total characters in all strings
        Map<String, List<String>> anagramsMap = new HashMap<String, List<String>>();

        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            if (!anagramsMap.containsKey(sortedWord)) {
                anagramsMap.put(sortedWord, new ArrayList<String>());
            }

            anagramsMap.get(sortedWord).add(word);
        }
        return new ArrayList<>(anagramsMap.values());
    }

    public List<List<String>> solve2(String[] strs) {
        // Time Complexity: O(n × k) - Optimized from O(n × k log k)
        // Instead of sorting each string, we count character frequencies
        // Space Complexity: O(n × k)
        
        Map<String, List<String>> anagramsMap = new HashMap<String, List<String>>();

        for (String word : strs) {
            String key = getKey(word);
            anagramsMap.putIfAbsent(key, new ArrayList<String>());
            anagramsMap.get(key).add(word);
        }
        return new ArrayList<>(anagramsMap.values());
    }

    private String getKey(String word) {
        int[] count = new int[26];
        for (char c : word.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Use # as delimiter for more compact and faster representation
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append(count[i]).append('#');
        }
        return sb.toString();
    }
}
// @lc code=end
