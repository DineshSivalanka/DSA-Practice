import java.util.*;
class Dfs {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> adjlist=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjlist.add(new ArrayList<>());
        }

        System.out.println("Enter Edges:");
        for(int i=0;i<e;i++){
            int from=sc.nextInt();
            int to=sc.nextInt();
            adjlist.get(from).add(to);
            adjlist.get(to).add(from);
    }
    for(int i=0;i<n;i++){
        System.out.println(i+"-->"+list.get(i));
    }
    
}
