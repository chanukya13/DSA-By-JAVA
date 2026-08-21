// Problem: Search in Rotated Sorted Array II
// LeetCode: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
// Difficulty: Medium
// Topics: Array, Binary Search

Code:-

class Solution {
    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<= high){
            int mid= low + (high-low)/2;
            if(nums[mid]== target) return true;

            if(nums[low]== nums[mid] && nums[mid]== nums[high]){
                low++;
                high--;
            } else if(nums[low] <= nums[mid]){
                if(nums[low] <= target && target <= nums[mid]){
                    high= mid-1;
                } else {
                    low = mid+1;
                }
            } else{
                if(nums[mid] <= target && target <= nums[high]){
                    low = mid+1;
                } else {
                    high= mid-1;
                }
            }
        }
        return false;
    }
}
