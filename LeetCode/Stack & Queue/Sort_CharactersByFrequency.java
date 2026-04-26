./*
451. Sort Characters By Frequency

Problem Link:
https://leetcode.com/problems/sort-characters-by-frequency/description/
*/

class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Frequency> pq=new PriorityQueue<>((a,b)->b.value - a.value);
        for(char key:map.keySet()){
            pq.add(new Frequency(key,map.get(key)));
        }

        StringBuilder result=new StringBuilder("");
        while(!pq.isEmpty()){
            Frequency temp=pq.poll();
            char ch=temp.key;
            int val=temp.value;
            for(int i=0;i<val;i++){
                result.append(ch);
            }
        }
        return result.toString();
    }
}
class Frequency{
    char key;
    int value;
    public Frequency(char key,int value){
        this.key=key;
        this.value=value;
    }
}