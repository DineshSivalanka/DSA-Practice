public class Main
{
    public static boolean armstrong(int n){
        int sum=0;
        int temp=n;
        int d=String.valueOf(n).length();
        while(n!=0){
            int rem=n%10;
            sum=sum+(int)Math.pow(rem,d);
            n=n/10;
        }
        return temp==sum;
    }
	public static void main(String[] args) {
		System.out.println("Armstrong Or Not(Yes/No):"+armstrong(164));
	}
}