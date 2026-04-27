/*
2182. Construct String With Repeat Limit

Problem Link:
https://leetcode.com/problems/construct-string-with-repeat-limit/description/
*/


class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Frequency> pq=new PriorityQueue<>((a,b) -> b.key - a.key);
        for(char key:map.keySet()){
            pq.add(new Frequency(key,map.get(key)));
        }

        StringBuilder result=new StringBuilder();
        while(!pq.isEmpty()){
            Frequency top=pq.poll();
            char key=top.key;
            int val=top.value;
            int cntToAdded=Math.min(val,repeatLimit);
            for(int i=0;i<cntToAdded;i++) result.append(key);
            val -= cntToAdded;

            if(val>0){
                if(pq.isEmpty()) break;
                Frequency top2=pq.poll();
                char key2=top2.key;
                int val2=top2.value;
                result.append(key2);
                if(val2-1>0){
                    pq.add(new Frequency(key2,val2-1));
                }
                pq.add(new Frequency(key,val));
            }
        }
        return result.toString();
    }
}

class Frequency{
    int value;
    char key;

    public Frequency(char key,int value){
        this.key=key;
        this.value=value;
    }
}