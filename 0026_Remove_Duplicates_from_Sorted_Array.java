Problem: Remove Duplicates from Sorted Array
LeetCode: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
Difficulty: Easy
Topics: Array, Two Pointers

Code:-

class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;

        if(n==0) return 0;
        int i=0;

        for(int j= 0;j<n;j++){
            if(nums[j] !=nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
       return i+1; 
    }
}