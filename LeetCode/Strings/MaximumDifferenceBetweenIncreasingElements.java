/*
2016. Maximum Difference Between Increasing Elements

Problem Link:
https://leetcode.com/problems/maximum-difference-between-increasing-elements/
 */

class Solution {
    public int maximumDifference(int[] nums) {
        int n=nums.length;
        int ans=-1;
        int l=nums[0];
        for(int i=1;i<n;i++){
           if(l<nums[i]){
            int temp=nums[i]-l;
            ans=Math.max(temp,ans);
           }
           l=Math.min(l,nums[i]);
        }
        return ans;
    }
}