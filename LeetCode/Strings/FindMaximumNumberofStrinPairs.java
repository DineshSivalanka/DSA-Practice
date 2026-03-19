/*
2744. Find Maximum Number of String Pairs
Problem Link:
https://leetcode.com/problems/find-maximum-number-of-string-pairs/
*/

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans=0;
        int n=words.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                String r=new StringBuilder(words[j]).reverse().toString();
                if(words[i].equals(r)){
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}