/*
2558. Take Gifts From the Richest Pile

Problem Link:
https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/
*/

class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder()); 
        for(int gift:gifts) maxHeap.add(gift);
        long sum=0;

        for(int i=0;i<k;i++){
            int a=maxHeap.poll();
            int val=(int) Math.sqrt(a);
            maxHeap.add(val);
        }
        for(int gift:maxHeap){
            sum+=gift;
        }
        return sum;
    }
}