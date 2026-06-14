//native approach 
// time complexity:0(n)
public class Main
{
	public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(isPrime(17));
	}
}





// optimal Approach
//Time complexity:o(root(n))
public class Main
{
	public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
	public static void main(String[] args) {
		System.out.println(isPrime(17));
	}
}