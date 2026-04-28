/*
1011. Capacity To Ship Packages Within D Days

Problem Link:
https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
*/


class Solution {
    public static boolean isPossible(int []weights,int days,int mid){
        int temp=0;;
        for(int r=0;r<weights.length;r++){
            int val=weights[r];
            if(temp+val>mid){
                days--;
                temp=0;
            }
            temp=temp+val;
            if(days<=0) return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l = 1;
        int r = 0;
        for(int w : weights){
            l = Math.max(l, w);
            r += w;
        }
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(weights,days,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}