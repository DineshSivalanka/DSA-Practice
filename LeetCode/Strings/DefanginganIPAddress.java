/*
Defanging an IP Address(LeetCode 1108)
Concept: String Manipulation
Key Idea: Replace "." with "[.]"

Problem Link:
https://leetcode.com/problems/defanging-an-ip-address/
 */
class Solution {
    public String defangIPaddr(String address) {
        String ans="";
        for(int i=0;i<address.length();i++){
            char ch=address.charAt(i);
            if('.'==ch) ans=ans+"[.]";
            else ans=ans+ch;
        }
        return ans;
    }
}