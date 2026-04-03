/*
1248. Count Number of Nice Subarrays

Problem Link:
https://leetcode.com/problems/count-number-of-nice-subarrays/description/
*/

class Solution {
    public static int atmost(int[] nums, int k){
        int l=0,ans=0,temp=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]%2==1) temp++;
            while(temp>k){
                if(nums[l]%2==1) temp--;
                l++;
            } 
            ans+=r-l+1;           
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int result=atmost(nums,k)-atmost(nums,(k-1));
        return result;
    }
}