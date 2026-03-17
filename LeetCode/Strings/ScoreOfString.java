/*
Score of a String (LeetCode 3110)
Concept: String Traversal
Key Idea: Calculate score using ASCII differences between adjacent characters

Problem Link:
https://leetcode.com/problems/score-of-a-string/
*/
class Solution {
    public int scoreOfString(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n-1;i++){
            char a=s.charAt(i),b=s.charAt(i+1);
            ans+=Math.abs(a-b);
        }
        return ans;
    }
}