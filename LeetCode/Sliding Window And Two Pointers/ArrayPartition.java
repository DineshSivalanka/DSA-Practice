/*
561. Array Partition


Problem Link:
http://leetcode.com/problems/array-partition/description/
*/


class Solution {
    public int arrayPairSum(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
            max+=nums[i];
        }
        return max;
        
    }
}