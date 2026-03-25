/*
1876. Substrings of Size Three with Distinct Characters

Problem Link:
https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/
*/

class Solution { 

    public int countGoodSubstrings(String s) {
        int ans=0, l=0;
        HashMap<Character, Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);

            if(r-l==3){
                char tch=s.charAt(l);
                map.put(tch,map.get(tch)-1);

                if(map.get(tch)==0){
                    map.remove(tch);
                }
                l++;
            }

            if(map.size()==3){
                ans++;
            }
        }
       return ans; 
    }
}