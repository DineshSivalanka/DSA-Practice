/*
410. Split Array Largest Sum

Problem Link:
https://leetcode.com/problems/split-array-largest-sum/description/
*/


class Solution {
    public static boolean isPossible(int nums[],int k,int mid){
        int temp=0;
        k--;
        for(int r=0;r<nums.length;r++){
            int val=nums[r];
            if(val>mid) return false;
            if(temp+val>mid){
                k--;
                temp=0;
            }
            temp+=val;
            if(k<0) return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=(int) Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,k,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}