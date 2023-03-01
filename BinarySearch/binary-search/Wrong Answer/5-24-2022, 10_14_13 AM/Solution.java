// https://leetcode.com/problems/binary-search

class Solution {
    public int search(int[] nums, int target) {
      
        
        int left = 0;
        int right = nums.length;
        
        while(left < right){
            int mid = left + (right - left) / 2;
            if(target == nums[mid]){
                return mid;
            }
            
            if(target > nums[mid]){
                left = mid + 1;
            }
            else {
                right = mid-1;
            }            
        }
        
        return left;
    }
}