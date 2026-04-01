/*
904. Fruit Into Baskets

Problem Link:
https://leetcode.com/problems/fruit-into-baskets/description/
*/

class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int l=0,ans=0;
        for(int r=0;r<n;r++){
            int val=fruits[r];
            map.put(val,map.getOrDefault(val,0)+1);
            while(map.size()>2){
                int lval=fruits[l];
                map.put(lval,map.get(lval)-1);
                if(map.get(lval)==0)  map.remove(lval);
                l++;
            }
      
            ans=Math.max(ans,r-l+1);
        }
        return ans;
        
    }
}