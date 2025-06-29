package day2.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1 {
    /**
     * Q1. Rotation Game
     * Solved
     * feature icon
     * Get your doubts resolved blazing fast with Chat GPT Help
     * Check Chat GPT
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.
     *
     *
     * Problem Constraints
     *
     * 1 <= N <= 106
     * 1 <= A[i] <=108
     * 1 <= B <= 109
     *
     *
     * Input Format
     *
     * There are 2 lines in the input
     *
     * Line 1: The first number is the size N of the array A. Then N numbers follow which indicate the elements in the array A.
     *
     * Line 2: A single integer B.
     *
     *
     * Output Format
     *
     * Print array A after rotating it B times towards the right.
     *
     *
     * Example Input
     *
     * Input 1 :
     * 4 1 2 3 4
     * 2
     *
     *
     * Example Output
     *
     * Output 1 :
     * 3 4 1 2
     *
     *
     * Example Explanation
     *
     * Example 1 :
     *
     * N = 4, A = [1, 2, 3, 4] and B = 2.
     *
     * Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
     *
     * Final array = [3, 4, 1, 2]
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[]inputs=br.readLine().split(" ");
        int N=Integer.parseInt(inputs[0]);
        int[]A=new int[N];
        for(int i=0;i<=A.length-1;i++)
        {
            A[i]=Integer.parseInt(inputs[i+1]);
        }
        int B=Integer.parseInt(br.readLine());
        int temp;
        //reverse [0,N-B-1]
        for(int i=0,j=N-B-1; i<j ;i++,j--)
        {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
        //reverse [N-B,N-1]
        for(int i=N-B,j=N-1; i<j ;i++,j--)
        {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
        //reverse [0,N-1]
        for(int i=0,j=N-1; i<j ;i++,j--)
        {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
        for(int i=0;i<=A.length-1;i++)
        {
            System.out.print(A[i]+" ");
        }

    }
}
