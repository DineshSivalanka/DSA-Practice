/*
771. Jewels and Stones
Problem Link:
https://leetcode.com/problems/jewels-and-stones/description/
 */

class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<jewels.length();i++){
            char c=jewels.charAt(i);
            if(map.containsKey(c)){
                count=count+map.get(c);
            }
        }
        return count;
        
    }
}