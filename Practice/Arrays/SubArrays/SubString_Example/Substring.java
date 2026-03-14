import java.util.*;
public class Substring {
    public static void main(String args[]){
    // String s="Dinesh";
    // for(int i=0;i<s.length();i++){
    //     for(int j=i;j<s.length();j++){
    //         for(int k=i;k<=j;k++){
    //             System.out.print(s.charAt(k));
    //         }
    //         System.out.println();
    //     }
    // }


    ArrayList<String> list=new ArrayList<>();
    String s="Dinesh";
    for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            System.out.println(s.substring(i,j+1));
        }
    }

    } 
}
    

