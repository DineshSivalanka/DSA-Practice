/*
Problem Name: Subarray Sum Equals K
Platform: LeetCode
Difficulty: Medium
Topic: Prefix Sum + HashMap

Problem Link:
https://leetcode.com/problems/subarray-sum-equals-k/

Approach:
Use Prefix Sum and a HashMap to track how many times a prefix sum has occurred.
*/

import java.util.Scanner;

public class MaxSubarraySumLenK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int arr[] = { 5, 9, 1, 8, 7 };
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= n - k; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            max = Math.max(sum, max);

        }
        System.out.println(max);
    }

}
