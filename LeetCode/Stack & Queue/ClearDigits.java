/*
3174. Clear Digits

Problem Link:
https://leetcode.com/problems/clear-digits/
 */

class Solution {
    public String clearDigits(String s) {
         Stack<Character> st=new Stack<>();
          StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(Character.isLetter(temp)) st.push(temp);
            else if(Character.isDigit(temp)) st.pop();
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}