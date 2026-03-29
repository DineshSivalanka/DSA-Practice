/*
1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold

Problem Link:
https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
*/



class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0,ans=0,sum=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            if(r-l==k){
                sum-=arr[l];
                l++;
            }
            if(r-l+1==k){
                int avg=sum/k;
                if(avg>=threshold) ans++;
            }
        }
        return ans;
    }
}