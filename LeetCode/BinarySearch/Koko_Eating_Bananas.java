/*
875. Koko Eating Bananas

Problem Link:
https://leetcode.com/problems/koko-eating-bananas/description/
*/


class Solution {
    public static boolean isPossible(int piles[],int h,int k){
        int temp=0;
        for(int i=0;i<piles.length;i++){
           int t=piles[i]/k;
           if(piles[i]%k !=0) t++;
           h-=t;
           if(h<0) return false;
        }
        return true;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        // int r=1_0_0_0_0_0_0_0_0_0;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(piles,h,mid)) r=mid-1;
            else l=mid+1;
        }
        return l; 
    }
}