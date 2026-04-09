/*
34.Find First and Last Position of Element in Sorted
Array 


https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
*/


class Solution {
     public static int left(int arr[],int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>=target) r=mid-1;
            else l=mid+1;
        }
        if(l>=arr.length) return -1;
        if(arr[l]!=target) return -1;
        return l;
    }
     public static int right(int arr[],int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(arr[mid]>target) r=mid-1;
            else l=mid+1;
        }
        if(r<0) return -1;
        if(arr[r]!=target) return -1;
        return r;
    }
    public int[] searchRange(int[] nums, int target) {
        int left=left(nums,target);
        int right=right(nums,target);
        int[] ans={left,right};
        return ans;
    }
}