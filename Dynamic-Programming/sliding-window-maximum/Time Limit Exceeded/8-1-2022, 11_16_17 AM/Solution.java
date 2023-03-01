// https://leetcode.com/problems/sliding-window-maximum

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
       int n = nums.length;
  if (n == 0 || k == 0) {
    return new int[0];
  }
  
  int numOfWindow = n - k + 1;
  int[] result = new int[numOfWindow]; // number of windows
  
  for (int start = 0; start < numOfWindow; ++start) {
    int end = start + k - 1;
    int maxVal = nums[start];
    for (int i = start + 1; i <= end; ++i) {
      if (nums[i] > maxVal) { // update
        maxVal = nums[i];
      }
    }
    result[start] = maxVal;
  }
  
  return result;
}
}