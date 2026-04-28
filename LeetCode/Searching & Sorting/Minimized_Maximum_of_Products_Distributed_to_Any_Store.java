/*
2064. Minimized Maximum of Products Distributed to Any Store

Problem Link:
https://leetcode.com/problems/minimized-maximum-of-products-distributed-to-any-store/description/
*/

class Solution {
    public static boolean isPossible(int n,int[] quantities,int mid){
        int sum=0;
        for(int r=0;r<quantities.length;r++){
            int temp=quantities[r]/mid;
            if(quantities[r]%mid !=0) temp++;
            sum=sum+temp;
            if(sum>n) return false;
        }
        return true;
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=(int)Math.pow(10,5);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(n,quantities,mid)) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
}