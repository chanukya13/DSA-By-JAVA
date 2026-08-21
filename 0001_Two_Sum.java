Problem: Two Sum
LeetCode: https://leetcode.com/problems/two-sum/
Difficulty: Easy
Topic: Arrays, HashTable

Code:-

import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> mp = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int temp = target - nums[i];
        if (mp.containsKey(temp)) {
            return new int[]{mp.get(temp), i};
        }
        mp.put(nums[i], i);
        }
        return new int[]{};                                                                                                   
    }
}

