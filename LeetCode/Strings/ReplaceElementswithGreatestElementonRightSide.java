/*
1299. Replace Elements with Greatest Element on Right Side
Problem Link:
https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
*/

class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length;
        int max=-1;
        int[] ans=new int[n];
        ans[n-1]=-1;
        for(int i=n-1;i>=0;i--){  
                ans[i]=max;
                max=Math.max(max,arr[i]);
                         
        }
        return ans;
    }
}