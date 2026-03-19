/*
169. Majority Element

Problem Link:
https://leetcode.com/problems/majority-element/description/
 */
import java.util.*;
class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int n=nums.length/2;
        for(int i:map.keySet()){
             int temp=map.get(i);
             if(temp>n){
                ans=i;
                break;
             }
        }
        return ans;
    }
}