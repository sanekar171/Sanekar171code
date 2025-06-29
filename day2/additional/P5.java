package day2.additional;

import java.util.Arrays;

public class P5 {
    /**
     * Q5. Multiple left rotations of the array
     * Solved
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
     *
     * Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.
     *
     *
     *
     * Problem Constraints
     *
     * 1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000
     *
     *
     * Input Format
     *
     * The first argument given is the integer array A.
     * The second argument given is the integer array B.
     *
     *
     * Output Format
     *
     * Return the resultant matrix.
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *     A = [1, 2, 3, 4, 5]
     *     B = [2, 3]
     *
     * Input 2:
     *
     *
     *     A = [5, 17, 100, 11]
     *     B = [1]
     *
     *
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *     [ [3, 4, 5, 1, 2]
     *      [4, 5, 1, 2, 3] ]
     *
     *
     * Output 2:
     *
     *
     *     [ [17, 100, 11, 5] ]
     *
     *
     *
     * Example Explanation
     *
     * for input 1 -> B[0] = 2 which requires 2 times left rotations
     *
     * 1: [2, 3, 4, 5, 1]
     *
     * 2: [3, 4, 5, 1, 2]
     *
     * B[1] = 3 which requires 3 times left rotation
     *
     * 1: [2, 3, 4, 5, 1]
     *
     * 2: [3, 4, 5, 1, 2]
     *
     * 2: [4, 5, 1, 2, 4]
     *
     *
     *
     *
     * Expected Output
     * Provide sample input and click run to see the correct output for the provided input. Use this to improve your problem understanding and test edge cases
     * Arg 1: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
     * Arg 2: An Integer Array, For e.g [1,2,3]
     * Enter Input Here
     */
    public static void main(String[] args) {
        int[]A ={1, 2, 3, 4, 5};
        int[]B = {2, 3};
        P5 p5=new P5();
        System.out.println(Arrays.deepToString(p5.solve(A,B)));
        A =new int[]{5, 17, 100, 11};
        B =new int[]{1};
        System.out.println(Arrays.deepToString(p5.solve(A,B)));
    }

    public int[][] solve(int[]A,int[]B)
    {
        //outer loop=number of rotations
        int N=A.length;
        int K;
        int[][]output=new int[B.length][];
        int[]oneRotateCountOutput=new int[N];
        for(int rotateCountIndex=0;rotateCountIndex<=B.length-1;rotateCountIndex++)
        {
            K=B[rotateCountIndex];
            K=K%N;//avoid AIOBE
            int temp;
            //copy original array to temp per call of rotate method
            int[]T=new int[N];
            for(int i=0;i<=N-1;i++)
            {
                T[i]=A[i];
            }

            //left rotate
            //reverse [0,K-1]
            for(int i=0,j=K-1; i<j ;i++,j--)
            {
                temp=T[i];
                T[i]=T[j];
                T[j]=temp;
            }

            //reverse [K,N-1]
            for(int i=K,j=N-1; i<j ;i++,j--)
            {
                temp=T[i];
                T[i]=T[j];
                T[j]=temp;
            }

            //reverse [0,N-1]
            for(int i=0,j=N-1; i<j ;i++,j--)
            {
                temp=T[i];
                T[i]=T[j];
                T[j]=temp;
            }
            //vital**********************
            oneRotateCountOutput=T;
            output[rotateCountIndex]=oneRotateCountOutput;
        }//loop of rotateCounts
        return output;
    }//
}
