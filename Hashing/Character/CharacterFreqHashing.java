import java.util.*;

public class CharacterFreqHashing {
    public static void main(String[] args) {
    
    String s="programming";
    int hash[]=new int[26];
    char ch='m';
    for(int i=0;i<s.length();i++){
        hash[s.charAt(i)-'a']++;
    }
    System.out.println(hash[ch-'a']);
    
    
   }
}
