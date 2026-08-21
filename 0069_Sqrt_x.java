Problem: Sqrt(x)
LeetCode: https://leetcode.com/problems/sqrtx/
Difficulty: Easy
Topics: Math, Binary Search

Code:-

class Solution {
    public int mySqrt(int x) {
        long low= 0;
        long high= x;
        long ans =0;
        while(low <= high){
            long mid= low + (high-low)/2;
            long sqrt = mid * mid;
            if(sqrt == x){
                ans= mid;
                break;
            } else if(sqrt > x){
                high = mid-1;
            } else{
                low = mid+1;
                ans=mid;
            }
        }
        return (int)ans;
    }
}