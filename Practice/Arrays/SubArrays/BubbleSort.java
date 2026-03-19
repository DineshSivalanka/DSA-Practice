class BubbleSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,9,7};
        int n=arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+",");
        }
        for(int i=0;i<n-1;i++){
            boolean swap=false;
            for(int j=0;j<n-1;j++){
             if(arr[j]<arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                swap=true;
             }
            } 
            if(swap==false){
                
                break;
            }
        }
        
        System.out.println("\nAfter Bubble Sort:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}