/*
151. Reverse Words in a String

Problem Link:
https://leetcode.com/problems/reverse-words-in-a-string/
*/

class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)==' ') continue;
            int j=i;
            for(;i>=0 && s.charAt(i) != ' ';i--){

            }
            sb.append(s.substring(i+1,j+1));
            sb.append(' ');
            
        }
       return sb.toString().trim(); 
    }
}