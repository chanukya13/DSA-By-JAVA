// Problem: Pascal's Triangle II
// LeetCode: https://leetcode.com/problems/pascals-triangle-ii/
// Difficulty: Easy
// Topics: Array, Dynamic Programming


Code:-

class Solution {
    public List<Integer> getRow(int rowIndex) {
        return fun(rowIndex+1);
    }
    public List<Integer> fun(int n){
        if(n==1){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            return row;
        }
        if(n==2){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            row.add(1);
            return row;
        }
        List<Integer> prev = fun(n-1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i =1;i<prev.size();i++){
            row.add(prev.get(i-1)+prev.get(i));
        }
        row.add(1);
        return row;
    }
}
