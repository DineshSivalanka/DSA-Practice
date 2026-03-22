/*
645. Set Mismatch
Problem Link:
https://leetcode.com/problems/set-mismatch/description/
 */
import java.util.*;
class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                dup=nums[i];
            }
        }
        int miss=0;
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                miss=i;
            }
        }
        int a[]={dup,miss};
        return a;
    }
}