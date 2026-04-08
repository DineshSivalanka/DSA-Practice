/*
Greatest Character Less Than Target

Given an array of character sorted in ascending
order, find the greatest character that is less than
the target character in the array.
Target character is not present in the array.

If there is not such element return ‘a’
{'c', 'e', 'g', 'k', 'y'}

Target = ‘d’ => ans = ‘c’

Target = ‘f’ => ans = ‘e’

Target = ‘z’ = > ans = ‘y’

Target = ‘b’ => ans = ‘a’
*/

class Main {
     public static char search(char[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(nums[mid]>target) r=mid-1;
            else l=mid+1;
        }
        if(r==-1) return 'a';
        return nums[r];
    }
    public static void main(String[] args) {
        char arr[]={'c','e','g','k','y'};
        char target='f';
        char r=search(arr,target);
        System.out.println(r);
        
    }
}