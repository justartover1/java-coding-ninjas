package recursion1.Assignment;

import java.util.Scanner;

/*Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
Input format :
Line 1 : Integer M
Line 2 : Integer N
Output format :
M x N
Constraints :
0 <= M <= 1000
0 <= N <= 1000
Sample Input 1 :
3
5
Sample Output 1 :
15
Sample Input 2 :
4
0
Sample Output 2 :
0*/
public class RecursiveMultiplication {

    public static int multiplication(int m, int n) {
        if (n == 0 || m == 0) {
            return 0;
        }
        return m + multiplication(m, (n - 1));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        System.out.println(multiplication(m, n));
    }
}
