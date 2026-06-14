public class ProductDigit
{
    public static int productDigit(int n){
        int product=1;
        if(n==0) return 0;
        while(n!=0){
            int rem=n%10;
            product*=rem;
            n=n/10;
        }
        return product;
    }
	public static void main(String[] args) {
		System.out.println(productDigit(789));
	}
}