package day2.additional;

public class P3 {
    /**
     * Q3. MINIMUM PICKS
     * Solved
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * You are given an array of integers A of size N.
     * Return the difference between the maximum among all even numbers of A and the minimum among all odd numbers in A.
     *
     *
     *
     * Problem Constraints
     *
     * 2 <= N <= 1e5
     * -1e9 <= A[i] <= 1e9
     * There is atleast 1 odd and 1 even number in A
     *
     *
     *
     * Input Format
     *
     * The first argument given is the integer array, A.
     *
     *
     *
     * Output Format
     *
     * Return maximum among all even numbers of A - minimum among all odd numbers in A.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *  A = [0, 2, 9]
     *
     *
     * Input 2:
     *
     *  A = [5, 17, 100, 1]
     *
     *
     *
     *
     * Example Output
     *
     * Output 1:
     *
     * -7
     *
     *
     * Output 2:
     *
     * 99
     *
     *
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     * Maximum of all even numbers = 2
     * Minimum of all odd numbers = 9
     * ans = 2 - 9 = -7
     *
     *
     * Explanation 2:
     *
     * Maximum of all even numbers = 100
     * Minimum of all odd numbers = 1
     * ans = 100 - 1 = 99
     *
     *
     *
     *
     *
     * Expected Output
     * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
     * Arg 1: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
     */
    public static void main(String[] args) {
        P3 p3=new P3();
        int[]A={0, 2, 9};//-7
        System.out.println(p3.solve(A));
        A=new int[]{5, 17, 100, 1};//99
        System.out.println(p3.solve(A));
    }

    public int solve(int[] A) {
        int N=A.length;
        int maxEven=Integer.MIN_VALUE;
        int minOdd=Integer.MAX_VALUE;
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]%2==0 && A[i]>maxEven)
                maxEven=A[i];

            if(A[i]%2!=0 && A[i]<minOdd)
                minOdd=A[i];
        }
        return maxEven-minOdd;
    }//
}
