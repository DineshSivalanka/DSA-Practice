/*
Two Strings Are Anagrams Or Not 
*/

import java.util.*;
class Main {
    public static boolean fun(HashMap<Character,Integer> map1,HashMap<Character,Integer> map2){
        if(map1.size()!=map2.size()) return false;
        for(char i:map1.keySet()){
         if(!map2.containsKey(i)) return false; 
         int a=map1.get(i);
         int b=map2.get(i);
         if(a!=b) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        String a="javascript";
        String b="javiptascr";
        for(int i=0;i<a.length();i++){
            char ch=a.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<b.length();i++){
            char ch=b.charAt(i);
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        boolean c=fun(map1,map2);
        System.out.println(c);
    }
}