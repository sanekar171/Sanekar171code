package day2.additional;

public class P2 {
    /**
     * Q2. Second Largest
     * Solved
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
     *
     *
     * Problem Constraints
     *
     * 1 <= |A| <= 105
     *
     *
     * 0 <= A[i] <= 109
     *
     *
     *
     *
     *
     * Input Format
     *
     * The first argument is an integer array A.
     *
     *
     *
     *
     *
     * Output Format
     *
     * Return the second largest element. If no such element exist then return -1.
     *
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *  A = [2, 1, 2]
     * Input 2:
     *
     *  A = [2]
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *  1
     * Output 2:
     *
     *  -1
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     *  First largest element = 2
     *  Second largest element = 1
     * Explanation 2:
     *
     *  There is no second largest element in the array.
     *
     *
     *
     * Expected Output
     * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
     * Arg 1: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
     */
    public static void main(String[] args) {
        int[]A={3,2,3};//second largest exists,o/p=1
        P2 p2=new P2();
        System.out.println(p2.solve(A));//2
        A=new int[]{2};//second largest cannot exist if N==1--edge case,o/o=-1
        System.out.println(p2.solve(A));//-1
        A=new int[]{2,2,2};//second largest cannot exist, since all elements are same
        //if max2=MIN_VALUE, return -1; o/o=-1
        System.out.println(p2.solve(A));//-1
    }

    public int solve(int[] A)
    {
        int N=A.length;
        if(N==1){return -1;}//edge case

        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;

        for(int i=0;i<=N-1;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
            }
            if(A[i]<max1 && A[i]>max2)
            {
                max2=A[i];
            }
        }
        /*even if now max2 remains MIN_VALUE
          =>all elements of array are same*/
        if(max2==Integer.MIN_VALUE){return -1;}//edge case
        return max2;
    }//
}
