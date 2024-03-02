/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
//Given an array of integers nums and an integer target, return indices of the 
//two numbers such that they add up to target. 
//
// You may assume that each input would have exactly one solution, and you may 
//not use the same element twice. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// 
//
// Example 2: 
//
// 
//Input: nums = [3,2,4], target = 6
//Output: [1,2]
// 
//
// Example 3: 
//
// 
//Input: nums = [3,3], target = 6
//Output: [0,1]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// -10⁹ <= target <= 10⁹ 
// Only one valid answer exists. 
// 
//
// 
//Follow-up: Can you come up with an algorithm that is less than 
//O(n²)
// time complexity?
//
// Related Topics Array Hash Table 👍 55096 👎 1881


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        // C1
        // init result array
        // loop i = 0 -> n - 2
            // loop j = i + 1 -> j -> n - 1
                // if nums[j] === target - nums[i]
                        // true -> add i, j -> result array -> return result array
        // * Time complexity O(n^2)
        // * Space complexity O(1)

        // C2
        // Create an empty hash table to store elements and their indeces
        Map<Integer, Integer> indexMap = new HashMap<>();

        // Iterate through the array from left to right
        for (int i = 0; i < nums.length; i++) {
            // For each element nums[i], calculate the complement by subtracting it from the target:
            // complement = target - nums[i]
            int complement = target - nums[i];

            // Check if the complement exists in the hash table. If it does, we have found the solution
            if (indexMap.containsKey(complement)) {
                return new int[] {indexMap.get(complement), i};
            }

            // If the complement does not exist in the hash table, add the current element nums[i]
            // to the hash table with its index as the value
            indexMap.put(nums[i], i);
        }
        //If not solution is found, return an empty array or an appropriate indicator
        return new int[]{};
    }
}
//leetcode submit region end(Prohibit modification and deletion)

// @lc code=end

