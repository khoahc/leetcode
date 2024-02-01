/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //C1            
        // for (int i = 0; i < n; ++i) {
        //     nums1[i + m] = nums2[i];
        // }
        // Arrays.sort(nums1);

        //C2
        int i = m - 1;
        int j = n - 1;
        int indexMaxValue = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[indexMaxValue--] = nums1[i--];       
            } else {
                nums1[indexMaxValue--] = nums2[j--];
            }
        }
    }
}
// @lc code=end

