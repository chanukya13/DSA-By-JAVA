// Problem: Merge Sorted Array
// LeetCode: https://leetcode.com/problems/merge-sorted-array/
// Difficulty: Easy
// Topics: Array, Two Pointers, Sorting

Code:-

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int i=m-1;
            int j=n-1;
            int k = m+n-1;
            while(i>=0 && j>=0){
                if(nums1[i] < nums2[j]){
                    nums1[k] =nums2[j];
                    j--;
                } else {
                    nums1[k] = nums1[i];
                    i--;
                }
                k--;
            }
            while(j>=0){
                nums1[k]= nums2[j];
                j--;
                k--;
            }
    }
}

