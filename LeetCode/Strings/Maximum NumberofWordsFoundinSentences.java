
/*
Maximum Number of Words Found in Sentences (LeetCode 2114)
Concept: String Traversal

Problem Link:
https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans=0;
        for(int i=0;i<sentences.length;i++){
            String ch=sentences[i];
            int temp=1;
            for(int j=0;j<ch.length();j++){
                if(ch.charAt(j)==' ') temp++;
            }
            ans=Math.max(temp,ans);
        }
        return ans;
    }
}