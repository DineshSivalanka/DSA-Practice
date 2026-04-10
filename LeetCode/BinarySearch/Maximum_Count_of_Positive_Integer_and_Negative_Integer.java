/*
2529. Maximum Count of Positive Integer and Negative Integer

Problem Link:
https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/
*/

class Solution {
    public static int left(int nums[],int target){
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target)  r=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public int maximumCount(int[] nums) {
       int neg=left(nums,0);
       int one=left(nums,1);
       int pos=nums.length-one;
       return Math.max(neg,pos);
    }
}