/*
2325. Decode the Message
Key Idea: Create a mapping between characters to decode the message
Problem Link:
https://leetcode.com/problems/decode-the-message/description/
 */

class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character,Character> map=new HashMap<>();
        char temp='a';
        // int temp=97;
        String ans="";
        for(int i=0;i<key.length();i++){
            char ch=key.charAt(i);
            // temp=(char)temp+1;
            if((!map.containsKey(ch)) && (ch!=' ')){
                map.put(ch,temp);
                temp++;
            }
        }
        for(int i=0;i<message.length();i++){
            char ch=message.charAt(i);
            if(ch==' ') ans+=' ';
            else{
                char val=map.get(ch);
                ans=ans+val;
            }             
        }
        return ans;

        }
}