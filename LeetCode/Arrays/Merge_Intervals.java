/*
56. Merge Intervals

Problem Link:
https://leetcode.com/problems/merge-intervals/description/
*/


import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (result.isEmpty() || result.get(result.size()-1)[1]<interval[0]) result.add(interval);
            else {
                result.get(result.size()-1)[1]=Math.max(result.get(result.size()-1)[1],interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}


/* -----------------(or)----------- */


import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       List<int[]> result=new ArrayList<>();
       result.add(intervals[0]);
       for(int i=1;i<intervals.length;i++){
         int[] current=intervals[i];
         int[] last=result.get(result.size()-1);
         if(current[0]<=last[1]) last[1]=Math.max(current[1],last[1]);
         else result.add(current);
        }
        return result.toArray(new int[result.size()][]);
    }
}