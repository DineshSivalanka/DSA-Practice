/*
20. Valid Parentheses

Problem Link:
https://leetcode.com/problems/valid-parentheses/description/
*/

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(temp=='(' || temp=='[' || temp=='{'){
                st.push(temp);
            }
            else{
                if(st.isEmpty()) return false;
                if((st.peek()=='(' && temp==')') ||
                   (st.peek()=='[' && temp==']') || 
                   (st.peek()=='{' && temp=='}')){
                     st.pop();
                   }
                else return false;
            }
        }
        return st.isEmpty();
    }
}