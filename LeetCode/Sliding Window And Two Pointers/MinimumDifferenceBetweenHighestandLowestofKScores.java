/*
1984. Minimum Difference Between Highest and Lowest of K Scores

Problem Link:
https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/
 */
import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        int ans=Integer.MAX_VALUE;
        int l=0;
        Arrays.sort(nums);
        for(int r=0;r<nums.length;r++){
            if(r-l==k) l++;
            if(r-l+1==k){
                int temp=nums[r]-nums[l];
                ans=Math.min(ans,temp);
            }
           
        }
        return ans;
    }
}