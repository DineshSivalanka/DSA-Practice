/*
Find Insert Position in Sorted Array

arr = [ 1,3,5,7,8,10]
Find the index Where We can insert a new element.
Element we are adding in the above array is not
there in the array.
*/

class Main {
     public static int search(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>target) r=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,10};
        int target=8;
        int r=search(arr,target);
        System.out.println(r);
        
    }
}