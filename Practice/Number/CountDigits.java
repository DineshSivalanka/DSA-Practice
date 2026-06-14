// public class CountDigits
// {
//     public static int countDigit(int n){
//         if(n==0) return 1;
//         n=Math.abs(n);
//         return (int) Math.log10(n)+1;
//     }
// 	public static void main(String[] args) {
// 		System.out.println("Count Digits:"+countDigit(-164));
// 	}
// }


//or

public class CountDigits
{
    public static int countDigit(int n){
        if(n==0) return 1;
        int count=0;
        while(n!=0){
            count++;
            n=n/10;
        }
        return count;
    }
	public static void main(String[] args) {
		System.out.println("Count Digits:"+countDigit(-1674));
	}
}