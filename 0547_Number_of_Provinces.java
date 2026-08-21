// Problem: Number of Provinces
// LeetCode: https://leetcode.com/problems/number-of-provinces/
// Difficulty: Medium
// Topics: Depth-First Search, Breadth-First Search, Union Find, Graph


Code:-


class Solution {
    void dfs(int node,int[]visited,ArrayList<ArrayList<Integer>>lt){
        visited[node]=1;
        for(Integer it:lt.get(node)){
            if(visited[it]==0){
                dfs(it,visited,lt);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>>lt=new ArrayList<>();
        for(int i=0;i<isConnected.length;i++){
            lt.add(new ArrayList<>());
        }
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[0].length;j++){
                if(isConnected[i][j]!=0){
                   lt.get(i).add(j);
                }
            }
        }
        int visited[]=new int[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(visited[i]==0){
                count++;
                dfs(i,visited,lt);
            }
        }
        return count;
    }
}


