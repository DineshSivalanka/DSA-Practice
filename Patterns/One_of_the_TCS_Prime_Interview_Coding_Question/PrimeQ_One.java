public class PrimeQ_One{
	public static void main(String[] args) {
		int n=4;
		int num=1;
		int num2=n*(n+1);
		for(int i=1;i<=n;i++){
		    for(int j=1;j<=i;j++){
		        System.out.print(num+" ");
		        num=num+1;
		    }
		    for(int j=1;j<=(2*(n-i));j++){
		        System.out.print("  ");
		    }
		    for(int j=i;j>=1;j--){
		        System.out.print(num2+" ");
		        num2=num2-1;
		    }
		    System.out.println();
		}
	}
}