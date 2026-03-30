/*
2024. Maximize the Confusion of an Exam

Problem Link:
https://leetcode.com/problems/maximize-the-confusion-of-an-exam/description/
 */



class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0,tcount=0,fcount=0,n=answerKey.length(),ans=0;
        for(int r=0;r<n;r++){
            char ch=answerKey.charAt(r);
            if(ch=='T') tcount++;
            else fcount++;
            while(Math.min(tcount,fcount)>k){
                 char ch2=answerKey.charAt(l);
                if(ch2=='T') tcount--;
                else fcount--;
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}