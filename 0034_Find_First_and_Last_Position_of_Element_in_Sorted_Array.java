Problem: Find First and Last Position of Element in Sorted Array
LeetCode: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
Difficulty: Medium
Topics: Array, Binary Search

Code:-

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first= lowerbound(nums,target);
        int last = upperbound(nums,target);

        if(first == nums.length || nums[first] != target){
            return new int[]{-1,-1}; 
        }
        return new int[]{first,last};
    }
    
    public int lowerbound(int[]nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<= high){
            int mid=  low+(high-low)/2;
            if(nums[mid] >= target){
                ans= mid;
                high= mid-1;
            }else {
                low =mid+1;
            }
        }
        return ans;
    }

    public int upperbound(int[]nums,int target){
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<= high){
            int mid=  low+(high-low)/2;
            if(nums[mid] > target){
                ans= mid;
                high= mid-1;
            }else {
                low =mid+1;
            }
        }
        return ans-1;
    }
}