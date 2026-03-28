/*
2144. Minimum Cost of Buying Candies With Discount

Problem Link:
https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/description/
*/

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int ans=0,count=0;
        for(int i=cost.length-1;i>=0;i--){
            if(count==2) count=0;
            else{
                ans=ans+cost[i];
                count++;
            }
        }
        return ans;
    }
}