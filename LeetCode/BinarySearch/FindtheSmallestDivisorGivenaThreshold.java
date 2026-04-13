/*
1283. Find the Smallest Divisor Given a Threshold

Problem Link:
https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
*/

class Solution {
    public static boolean isPossible(int []nums,int threshold,int k){
         for(int i=0;i<nums.length;i++){
            int t=nums[i]/k;
            if(nums[i]%k != 0) t++;
            threshold-=t;
            if(threshold<0) return false;
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
       int l=1,r=1000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,threshold,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}