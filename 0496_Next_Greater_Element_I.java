// Problem: Next Greater Element I
// LeetCode: https://leetcode.com/problems/next-greater-element-i/
// Difficulty: Easy
// Topics: Array, Hash Table, Stack, Monotonic Stack

Code:-

import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int n = nums2.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    ans[i] = nge[j];
                    break;
                }
            }
        }
        return ans;
    }
    public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int[] ans = sol.nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }
}
}

