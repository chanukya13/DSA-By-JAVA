Problem: Permutations
LeetCode:https://leetcode.com/problems/permutations/
Difficulty: Medium
Topics: Array, Backtracking

Code:-

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List< Integer>> ans =new ArrayList<>();
        List<Integer> DS = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recursion(nums,DS,ans,freq);
        return ans;
    }
    public void recursion(int[] nums,List<Integer> DS, List<List<Integer>> ans, boolean[] freq){
        if(DS.size() == nums.length){
            ans.add(new ArrayList<>(DS ));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]= true;
                DS.add(nums[i]);
                recursion(nums, DS, ans,freq);
                DS.remove(DS.size()-1);
                freq[i]= false;
            }
        }
    }
}
