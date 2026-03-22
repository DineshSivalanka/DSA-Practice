/*
205. Isomorphic Strings
Problem Link:
https://leetcode.com/problems/isomorphic-strings/description/
 */

import java.util.HashMap;

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map=new HashMap<>();
        HashMap<Character,Character> reverse=new HashMap<>();
        boolean ans=true;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);
            if(!map.containsKey(ch1) && !reverse.containsKey(ch2)){
                map.put(ch1,ch2);
                reverse.put(ch2,ch1);
            }
            else if(map.containsKey(ch1) && map.get(ch1)!=ch2){
                ans=false;
                break;
            }
            else if(reverse.containsKey(ch2) && reverse.get(ch2)!=ch1){
                ans= false;
                break;
            }
        }    
        return ans;
    }
}