/*
682. Baseball Game

Problem Link:
https://leetcode.com/problems/baseball-game/description/
*/

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int sum=0;
        for(int i=0;i<operations.length;i++){
            String temp=operations[i];
            if(temp.equals("C") &&  st.size()>=1){
                st.pop();
            }
            else if(temp.equals("D") && st.size()>=1){
                int d=st.peek();
                int ans=d*2;
                st.push(ans);
            }
            else if(temp.equals("+") && st.size()>=2){
                int a1=st.pop();
                int a2=st.peek();
                int ans=a1+a2;
                st.push(a1);
                st.push(ans);
            }
            else{
                st.push(Integer.parseInt(temp));
            }
        }
        for(int k:st) sum+=k;
        return sum;
    }
}   