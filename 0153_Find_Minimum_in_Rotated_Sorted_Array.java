// Problem: Find Minimum in Rotated Sorted Array
// LeetCode: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
// Difficulty: Medium
// Topics: Array, Binary Search


Code:-


class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int minimum=Integer.MAX_VALUE;
        while(low<= high){
            int mid= (low+high)/2;
            if(nums[low] <= nums[mid]){
               minimum= Math.min(minimum,nums[low]);
               low= mid+1;
               
            }else{
                minimum= Math.min(minimum,nums[mid]);
                high=mid-1;
            }    
        }
        return minimum;
    }
}