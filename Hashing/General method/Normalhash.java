import java.util.*;
public class NormalHash {
    public static void main(String[] args) {
    int arr[]={1,3,4,2,1,3};
    int number=4;
    int c=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]==number){
            c=c+1;
        }
    }
    System.out.println(c);
    }
}
