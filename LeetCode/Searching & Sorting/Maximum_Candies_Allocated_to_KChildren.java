/*
2226. Maximum Candies Allocated to K Children

Problem Link:
https://leetcode.com/problems/maximum-candies-allocated-to-k-children/description/
*/

class Solution {
    public static boolean isPossible(int candies[],long k,int mid){
        for(int r=0;r<candies.length;r++){
            int val=candies[r]/mid;
            k-=val;
            if(k<=0) return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
        int l=1;
        int r=(int) Math.pow(10,7);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(candies,k,mid)) l=mid+1;
            else r=mid-1;
        }
        return r;
    }
}