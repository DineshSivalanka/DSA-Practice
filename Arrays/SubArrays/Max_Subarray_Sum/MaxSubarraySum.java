public class MaxSubarraySum {
    public static void main(String args[]) {
        int arr[] = { 5, 9, 1, 8, 7 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int temp = 0;
                for (int k = i; k <= j; k++) {
                    temp += arr[k];
                    max = Math.max(temp, max);
                }

            }
        }
        System.out.print("max:" + max);
    }
}
