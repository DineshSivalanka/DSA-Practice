/*
1004. Max Consecutive Ones III

Problem Link:
https://leetcode.com/problems/max-consecutive-ones-iii/description/
*/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,temp=0,ans=0,n=nums.length;
        for(int r=0;r<n;r++){
            if(nums[r]==0) temp++;
            while(temp>k){
                if(nums[l]==0) temp--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
       return ans;
    }
}