/*
Final Value of Variable After Performing Operations(LeetCode 2011)
Concept: Simulation
Key Idea: Increment/Decrement based on given operations

Problem Link:
https://leetcode.com/problems/final-value-of-variable-after-performing-operations/
 */

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            String temp = operations[i];
            if (temp.equals("X++") || temp.equals("++X"))
                x = x + 1;
            else
                x = x - 1;
        }
        return x;
    }
}