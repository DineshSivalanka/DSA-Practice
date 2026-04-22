/*
1614. Maximum Nesting Depth of the Parentheses

Problem Link:
https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
*/

class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int maxdepth=0;
        for(int i=0;i<s.length();i++){
            char temp=s.charAt(i);
            if(temp=='('){
                st.push(temp);
            }
            else if(temp==')'){
                st.pop();
            }
             maxdepth=Math.max(maxdepth,st.size());
        }
        return maxdepth;
    }
}