/*
Reverse Of a String 
*/

import java.util.*;
class Main {
    public static void main(String[] args) {
       String s="Dinesh Sivalanka";
       Stack<Character> st=new Stack<>();
       for(int i=0;i<s.length();i++){
           st.push(s.charAt(i));
       }
       StringBuilder sb=new StringBuilder();
       while(!st.isEmpty()){
           sb.append(st.pop());
       }
       System.out.println(sb.toString());
    }
}