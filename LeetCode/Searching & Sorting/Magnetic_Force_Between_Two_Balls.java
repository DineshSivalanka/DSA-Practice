/*
1552. Magnetic Force Between Two Balls

Problem Link:
https://leetcode.com/problems/magnetic-force-between-two-balls/
*/


class Solution {
    public static boolean isPossible(int position[],int m,int k){
        int prev=position[0];
        m--;
        for(int r=1;r<position.length;r++){
           int  val=position[r];
            if(val-prev>=k){
                m--;
                prev=val;
            }
            if(m<=0) return true;  
        }
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int l=1;
        int r=(int) Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(position,m,mid)) l=mid+1;
            else r=mid-1;
        }  
        return r;
    }
}