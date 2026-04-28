/*
268. Missing Number

Problem Link:
https://leetcode.com/problems/missing-number/description/
*/


class Solution {
    public int missingNumber(int[] nums){
        Arrays.sort(nums);
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]==mid){
                 l=mid+1;
            }
            else r=mid-1;
        }
        return l;
    }
}