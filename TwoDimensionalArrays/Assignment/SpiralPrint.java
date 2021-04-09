package TwoDimensionalArrays.Assignment;

import java.util.Scanner;

/*For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.
Refer to the Image:
Alt txt
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
Second line onwards, the next 'N' lines or rows represent the ith row values.
Each of the ith row constitutes 'M' column values separated by a single space.
Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.
Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
Sample Input 2:
2
3 3
1 2 3
4 5 6
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5
10 20 30 */
public class SpiralPrint {

    public static void spiralPrint(int[][] arr) {
        int nRows = arr.length;
        int mCols = arr[0].length;
        int i, rowStart = 0, colStart = 0;
        int numElements = nRows * mCols, count = 0;

        while (count < numElements) {
            for (i = colStart; count < numElements && i < mCols; i++) {
                System.out.print(arr[rowStart][i] + "\t");
                count++;
            }
            rowStart++;

            for (i = rowStart; count < numElements && i < nRows; i++) {
                System.out.print(arr[i][mCols - 1] + "\t");
                count++;
            }
            mCols--;

            for (i = mCols - 1; count < numElements && i >= colStart; i--) {
                System.out.print(arr[nRows - 1][i] + "\t");
                count++;
            }
            nRows--;

            for (i = nRows - 1; count < numElements && i >= rowStart; --i) {
                System.out.print(arr[i][colStart] + "\t");
                count++;
            }
            colStart++;
        }
    }

    public static int[][] takeInput() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = scan.nextInt();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCases = scan.nextInt();
        while (testCases != 0) {
            int[][] arr = takeInput();
            spiralPrint(arr);
            testCases--;
        }
    }
}
