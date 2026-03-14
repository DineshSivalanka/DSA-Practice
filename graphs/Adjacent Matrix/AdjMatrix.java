import java.util.*;
class AdjMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        int e=sc.nextInt();
        int[][] matrix=new int[n][n];
        System.out.println("Enter Edges:");
        for(int i=0;i<e;i++){
            int l=sc.nextInt();
            int r=sc.nextInt();
            matrix[l][r]=1;
            matrix[r][l]=1;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
