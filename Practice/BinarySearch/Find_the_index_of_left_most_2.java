/*
Find the index of left most 2
 */

class Main {
    public static int search(int arr[],int target){
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
    public static void main(String[] args) {
      int arr[]={1,2,2,2,2,3};
      int target=2;
      System.out.println(search(arr,target));
    }
}