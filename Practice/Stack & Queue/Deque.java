/*
Deque
 */


import java.util.*;
class Main {
    public static void main(String[] args) {
        String name[]={"Kumar","Dinesh","bala"};
        int age[]={20,21,19};
        String flag[]={"pink","green","blue"};
        Deque<Student> dq=new LinkedList<>();
        for(int i=0;i<name.length;i++){
            dq.add(new Student(name[i],age[i],flag[i]));
        }
        while(!dq.isEmpty()){
            Student front=dq.pollFirst();
            System.out.println(front.name);
            if(!dq.isEmpty()){
                 Student last=dq.pollLast();
                 System.out.println(last.name);
            }
        }
        
    }
}
class Student{
        String name;
        int age;
        String flag;
        public Student(String name,int age,String flag)
        {
            this.name=name;
            this.age=age;
            this.flag=flag;
        }
}