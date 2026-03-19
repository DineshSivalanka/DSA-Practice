/*
2078. Two Furthest Houses With Different Colors

Problem Link:
https://leetcode.com/problems/two-furthest-houses-with-different-colors/description/
 */

class Solution {
    public int maxDistance(int[] colors) {
        int ans=0,r=colors.length-1;
        for(int i=0;i<colors.length-1;i++){
            if(colors[i]!=colors[r]) ans=Math.max(ans,r-i);
            if(colors[0]!=colors[i]) ans=Math.max(ans,i);
        }
        return ans;
    }
}