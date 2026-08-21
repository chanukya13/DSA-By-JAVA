// Problem: Final Prices With a Special Discount in a Shop
// LeetCode: https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
// Difficulty: Easy
// Topics: Array, Stack, Monotonic Stack


Code:-


 import java.util.*;
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer>st =new Stack<>();
         int n = prices.length;
        int[] answer =new int[n];
        for (int i =n-1;i>=0;i--) {
            while (!st.isEmpty() && st.peek()>prices[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                answer[i]=prices[i];
            }else{
                answer[i]=prices[i]-st.peek();
            }
            st.push(prices[i]);
        }
        return answer;
    }
    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int[] result = sol.finalPrices(prices);
        System.out.println(Arrays.toString(result));
        sc.close();
    }
    }
}
