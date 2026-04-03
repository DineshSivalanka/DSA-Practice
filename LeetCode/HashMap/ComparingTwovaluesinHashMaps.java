/*
Comparing Two values in HashMaps
 */

import java.util.*;
class Main {
    public static boolean fun(HashMap<Integer,Integer> a,HashMap<Integer,Integer> b){
        if(a.size()!=b.size()) return false;
        for(int key:a.keySet()){
            if(!b.containsKey(key)) return false;
            int aa=a.get(key);
            int bb=b.get(key);
            if(aa!=bb) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        HashMap<Integer,Integer> a=new HashMap<>();
        a.put(2,30);
        a.put(3,30);
        HashMap<Integer,Integer> b=new HashMap<>();
        b.put(2,30);
        b.put(3,30);
        boolean c=fun(a,b);
        System.out.println(c);
    }
}