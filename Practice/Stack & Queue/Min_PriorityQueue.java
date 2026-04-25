/*
Min PriorityQueue
 */

import java.util.*;
class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(20);
        pq.add(1);
        System.out.println(pq);
        int toBeAdded[]={1,4,3,2};
        for(int i=0;i<toBeAdded.length;i++){
            pq.add(toBeAdded[i]);
            System.out.println(pq);
            System.out.println("PriorityQueue removed:"+pq.poll());
        }
    }
}