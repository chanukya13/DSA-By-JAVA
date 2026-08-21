Problem: Median of Two Sorted Arrays LeetCode:https://leetcode.com/problems/median-of-two-sorted-arrays/
Difficulty: Hard
Topics: Array, Binary Search, Divide and Conquer


Code:-

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m =nums2.length;
         int[] merge =new int[n+m];
         int i=0;
         int j=0;
         int k=0;
         while(i<n && j<m){
             if(nums1[i] <= nums2[j]){
                 merge[k]= nums1[i];
                 i++;
             } else{
                 merge[k]= nums2[j];
                 j++;
             }
             k++;
         }
         while(i <n){
              merge[k]= nums1[i];
              i++;
              k++;
         }
         while(j <m){
              merge[k]= nums2[j];
              j++;
              k++;
         }
         int x= merge.length;
         double median;
         if( x % 2 == 0){
             median= (merge[x/2 -1] + merge[x/2])/2.0 ;
         } else {
             median = merge[(x-1)/2];
         }
         return median;
    }
    
}