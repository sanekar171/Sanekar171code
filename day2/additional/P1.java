package day2.additional;

public class P1 {
    /**
     * Q1. Little Ponny and Maximum Element
     * Solved
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.
     *
     * He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.
     *
     *
     *
     * Problem Constraints
     *
     * 1 <= |A| <= 105
     *
     * 1 <= A[i] <= 109
     *
     *
     *
     * Input Format
     *
     * The first argument of input contains an integer array, A.
     *
     * The second argument of input contains an integer, B.
     *
     *
     *
     * Output Format
     *
     * Return an integer representing the answer.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *  A = [2, 4, 3, 1, 5]
     *  B = 3
     * Input 2:
     *
     *  A = [1, 4, 2]
     *  B = 3
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *  2
     * Output 2:
     *
     *  -1
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     *  We need to remove 4 and 5 to make 3 the biggest element.
     * Explanation 2:
     *
     *  As 3 doesn't exist in the array, the answer is -1.
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
        int[]A={2, 4, 3, 1, 5};
        int B=3;

        P1 p1=new P1();

        System.out.println(p1.solve(A,B));

        A=new int[]{1, 4, 2};
        B=3;

        System.out.println(p1.solve(A,B));
    }

    public int solve(int[] A, int B){
        int N=A.length;
        Boolean isBPresent=Boolean.FALSE;
        int countGreaterThanB=0;
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]==B)
            {
                isBPresent=Boolean.TRUE;
            }
        }
        if(isBPresent)
        {
            for(int i=0;i<=N-1;i++)
            {
                if(A[i]>B)
                {
                    countGreaterThanB++;
                }
            }
            return countGreaterThanB;
        }
        return -1;
    }//
}
