/*
4Sum

*/


import java.util.*;
class Main {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Set<List<Integer>> result=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        if(nums[i]+nums[j]+nums[k]+nums[l]==target){
                            List<Integer> temp=Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            Collections.sort(temp);
                            result.add(temp);
                        }
                    }
                }
            }
            
        }
        return new ArrayList<>(result);
        
    }
    public static void main(String[] args) {
        int nums[]={1,0,-1,0,-2,2};
        int target=0;
        System.out.println(fourSum(nums,target));
    }
}