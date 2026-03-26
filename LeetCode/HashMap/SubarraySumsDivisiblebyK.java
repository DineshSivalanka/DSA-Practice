/*
974. Subarray Sums Divisible by K

Problem Link:
https://leetcode.com/problems/subarray-sums-divisible-by-k/description/
 */


import java.util.*;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0, count = 0;
        for (int num : nums) {
            sum += num;
            int rem = sum % k;
            if (rem < 0) rem += k; 
            if (map.containsKey(rem)) {
                count += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return count;
    }
}