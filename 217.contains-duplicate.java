/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> countSet = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            boolean isContain = !countSet.add(nums[i]);
            if (isContain) {
                return true;
            }
        }
        return false;
    }
}
// @lc code=end

