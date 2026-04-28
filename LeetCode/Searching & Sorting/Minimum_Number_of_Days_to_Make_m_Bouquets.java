/*
1482. Minimum Number of Days to Make m Bouquets

Problem Link:
https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
*/


class Solution {
    public static boolean isPossible(int bloomDay[],int m,int k,int day){
        int took=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                took++;
            }
            else took=0;
            if(took==k){
                m--;
                took=0;
            }
            if(m==0) return true;
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int l=1;
        int r=(int)Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(bloomDay,m,k,mid)) r=mid-1;
            else l=mid+1;
        }
        int exceed=(int) Math.pow(10,9);
        if(l==exceed+1) return -1;
        return l;
    }
}