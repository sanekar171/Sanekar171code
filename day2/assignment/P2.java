package day2.assignment;

public class P2 {
    /**
     * Q2. Good Pair
     * Solved
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
     *
     *
     *
     * Problem Constraints
     *
     * 1 <= A.size() <= 104
     *
     * 1 <= A[i] <= 109
     *
     * 1 <= B <= 109
     *
     *
     *
     * Input Format
     *
     * First argument is an integer array A.
     *
     * Second argument is an integer B.
     *
     *
     *
     * Output Format
     *
     * Return 1 if good pair exist otherwise return 0.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     * A = [1,2,3,4]
     * B = 7
     * Input 2:
     *
     * A = [1,2,4]
     * B = 4
     * Input 3:
     *
     * A = [1,2,2]
     * B = 4
     *
     *
     * Example Output
     *
     * Output 1:
     *
     * 1
     * Output 2:
     *
     * 0
     * Output 3:
     *
     * 1
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     *  (i,j) = (3,4)
     * Explanation 2:
     *
     * No pair has sum equal to 4.
     * Explanation 3:
     *
     *  (i,j) = (2,3)
     *
     *
     *
     * Expected Output
     * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
     * Arg 1: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
     * Arg 2: A single Integer, For e.g 9
     * Enter Input Here
     */
    public static void main(String[] args) {
        P2 p2=new P2();
        int[]A={1,2,3,4};
        int B=7;
        System.out.println(p2.solve(A,B));
        A=new int[]{1,2,4};
        B=4;
        System.out.println(p2.solve(A,B));
        A=new int[]{1,2,2};
        B=4;
        System.out.println(p2.solve(A,B));
    }

    public int solve(int[] A, int B) {
        int N=A.length;
        for(int i=0;i<=N-1;i++)
        {
            for(int j=i+1;j<=N-1;j++)
            {
                if(A[i]+A[j]==B)
                {
                    return 1;
                }
            }
        }
        return 0;
    }
}
