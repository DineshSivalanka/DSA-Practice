/*
Array search

Problem Link:
https://www.geeksforgeeks.org/problems/search-an-element-in-an-array-1587115621/0
*/


import java.util.Arrays;
class Solution {
    public int search(int arr[], int x) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
