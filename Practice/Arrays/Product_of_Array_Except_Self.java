/*
238. Product of Array Except Self

Brute Force
*/


import java.util.*;

class Main {
    public static int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int arr[]=new int[n];
       for(int i=0;i<n;i++){
          int prod=1;
          for(int j=0;j<n;j++){
            if(i!=j) prod*=nums[j];
          }
          arr[i]=prod;
        }
        return arr;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4};
         System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}