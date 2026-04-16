/*
1760. Minimum Limit of Balls in a Bag

Problem Link:
https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/
*/


class Solution {
    public static boolean isPossible(int nums[],int m,int k){
        for(int r=0;r<nums.length;r++){
            int temp=nums[r]/k;
            if(nums[r]%k !=0) temp++;
            temp--;
            m-=temp;
            if(m<0) return false;
        }
        return true;

    }
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=(int) Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,maxOperations,mid)) r=mid-1;
            else l=mid+1;
        }  
        return l;
    }
}