/*
Custom Objects in Stack
 */


import java.util.*;
class Main {
    public static void main(String[] args) {
        String name[]={"kumar","Dinesh","bala"};
        int run[]={0,100,50};
        String nickname[]={"kum","Din","bal"};
                
        Stack<Cricketers> st=new Stack<>();
        for(int i=0;i<name.length;i++){
            st.push(new Cricketers(name[i],run[i],nickname[i]));
        }
        System.out.println(st.size());
        for(Cricketers i:st){
            System.out.println(i.name+":"+i.run+":"+i.nickname);
        }
    }
}

class Cricketers{
    String name;
    int run;
    String nickname;
    public Cricketers(String name,int run,String nickname){
        this.name=name;
        this.run=run;
        this.nickname=nickname;
    }
}