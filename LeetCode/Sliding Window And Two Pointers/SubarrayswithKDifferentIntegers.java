/*
992. Subarrays with K Different Integers

Problem Link:
https://leetcode.com/problems/subarrays-with-k-different-integers/description/
*/


class Solution {
    public static int  atmostk(int[] nums, int k){
        int l=0,ans=0;
        if(k<0) return 0;
        HashMap<Integer,Integer> map1=new HashMap<>();
        for(int r=0;r<nums.length;r++){
            map1.put(nums[r],map1.getOrDefault(nums[r],0)+1);
            while(map1.size()>k){
                int val=nums[l];
                map1.put(val,map1.get(val)-1);
                if(map1.get(val)==0){
                    map1.remove(val);
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmostk(nums,k)-atmostk(nums,k-1);
    }
}