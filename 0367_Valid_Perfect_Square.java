// Problem: Valid Perfect Square
// LeetCode: https://leetcode.com/problems/valid-perfect-square/
// Difficulty: Easy
// Topics: Math, Binary Search


Code:-

class Solution {
    public boolean isPerfectSquare(int num) {
        long low=1;
        long high= num;
        while(low <= high){
            long mid = low +(high -low )/2;
            long sqrt= mid*mid;
            if(num == sqrt) return true;

            if(sqrt > num){
                high= mid-1;
            } else{
                low =mid+1;
            }
        }
        return false;
    }
}