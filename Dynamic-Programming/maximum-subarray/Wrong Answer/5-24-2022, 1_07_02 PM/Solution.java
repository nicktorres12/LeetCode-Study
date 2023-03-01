// https://leetcode.com/problems/maximum-subarray

class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        
        for(int i = 1; i < nums.length;i++){
            nums[i] = Math.max(nums[i], nums[i] + nums[i-1]);
            max = Math.max(nums[i],max);
        }
        return max;
        
    }
}