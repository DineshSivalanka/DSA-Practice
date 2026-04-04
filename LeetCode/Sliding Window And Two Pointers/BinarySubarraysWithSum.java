/*
930. Binary Subarrays With Sum

Problem Link:
https://leetcode.com/problems/binary-subarrays-with-sum/description/
*/

class Solution {
    public static int atmost(int []nums,int goal){
        if(goal<0) return 0;
        int l=0,temp=0,ans=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]==1) temp++;
            while(temp>goal){
                if(nums[l]==1) temp--;
                l++;
            }
            ans+=r-l+1;
        }
        return ans;

    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int result=atmost(nums,goal)-atmost(nums,goal-1);
        return result;
        
    }
}