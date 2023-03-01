// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int left = 0;
        int right = nums.length-1;
        
        while(left < right){
            if(nums[left] + nums[right] == target){
                return new int[]{left+1,right+1};
            }
            else if(nums[left] + nums[right] < target){
            left++;
            }
            else{
                right--;
            }
            
        }
        
        return new int[]{};
        
        
    }
}