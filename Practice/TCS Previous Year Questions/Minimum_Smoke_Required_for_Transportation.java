/* Minimum Smoke Required for Transportation

Problem Statement
A transportation company has two types of vehicles:
• Van
o Can carry 100 persons
o Produces X units of smoke
• Car
o Can carry 4 persons
o Produces Y units of smoke

Given N persons who need to travel, determine the minimum amount of smoke produced
by using any combination of vans and cars such that all N persons are accommodated.
You may use any number of vans and cars.

Input Format
• The first line contains an integer T, the number of test cases.
• Each of the next T lines contains three space-separated integers:
o N – Number of persons
o X – Smoke produced by one van
o Y – Smoke produced by one car

Output Format
For each test case, print a single integer representing the minimum smoke required to
transport all N persons.

Constraints
• 1 <=T <= 10^5
• 1 <= N <= 10^9
• 1 <= X, Y <=10^9

Sample Input
3
105 50 10
20 50 10
20 50 2

Sample Output
70
50
10

Explanation
Test Case 1
• 105 persons need to travel.
• Use 1 van (100 persons) and 2 cars (8 persons).
• Total smoke = 50 + 2 × 10 = 70.
Using only cars would require 27 cars, producing 270 units of smoke, which is higher.

Test Case 2
• 20 persons need to travel.
• Using 5 cars accommodates all 20 persons.
• Smoke = 5 × 10 = 50.
Using a van would also produce 50 smoke, so the minimum is 50.

Test Case 3
• 20 persons need to travel.
• Using 5 cars produces 5 × 2 = 10 smoke.
• A van would produce 50 smoke.
Hence, the minimum smoke is 10.
 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long arr[] = new long[t];
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();

            long onlycars = ((n + 3) / 4) * y;
            long vans = n / 100;
            long rem = n % 100;
            long mix = vans * x + (rem + 3) / 4 * y;
            long extravans = (vans + 1) * x;
            long ans = Math.min(onlycars, Math.min(mix, extravans));
            arr[i] = ans;
        }

        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }
}
