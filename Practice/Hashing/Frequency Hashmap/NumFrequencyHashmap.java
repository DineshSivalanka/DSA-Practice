import java.util.*;
public class NumFrequencyHashmap {
    public static void main(String args[]){
        int arr[]={2,2,3,3,4,3,5,8,12,89,7};
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        System.out.println(map);
    }
}
