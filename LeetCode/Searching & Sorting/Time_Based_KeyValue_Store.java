/*
981. Time Based Key-Value Store

Problem Link:
https://leetcode.com/problems/time-based-key-value-store/description/
*/


class TimeMap {
    
    HashMap<String,List<Pair>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key))  map.put(key,new ArrayList<>());
        map.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        List<Pair> list=map.get(key);
        int l=0,r=list.size()-1;
        String result="";
        while(l<=r){
            int mid=l+(r-l)/2;
            if(list.get(mid).timestamp<=timestamp){
                result=list.get(mid).value;
                l=mid+1;
            }
            else r=mid-1;
        }
        return result;
    }
}

class Pair{
    int timestamp;
    String value;
    Pair(int timestamp,String value){
        this.timestamp=timestamp;
        this.value=value;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */