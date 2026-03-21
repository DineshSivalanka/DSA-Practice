/*
1512. Number of Good Pairs
Problem Link:
https://leetcode.com/problems/number-of-good-pairs/description/
 */

class Solution {
    public int numIdenticalPairs(int[] nums) {
      HashMap<Integer,Integer> map=new HashMap<>();
      int count=0;
      for(int i=0;i<nums.length;i++){
        if(map.containsKey(nums[i])){
            map.put(nums[i],map.get(nums[i])+1);
        }
         else{
            map.put(nums[i],1);
         }
      }
      for(int i:map.keySet()){
        int n=map.get(i);
        count=count+((n*(n-1))/2);
      }
      return count;
    }
}