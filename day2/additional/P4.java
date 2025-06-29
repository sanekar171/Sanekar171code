package day2.additional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4 {
    /**
     * Q4. Separate Odd Even
     * Solved
     * feature icon
     * Get your doubts resolved blazing fast with Chat GPT Help
     * Check Chat GPT
     * feature icon
     * Using hints except Complete Solution is Penalty free now
     * Use Hint
     * Problem Description
     *
     * You are given an integer T denoting the number of test cases. For each test case, you are given an integer array A.
     *
     * You have to print the odd and even elements of array A in 2 separate lines.
     *
     * NOTE: Array elements should have the same relative order as in A.
     *
     *
     *
     * Problem Constraints
     *
     * 1 <= T <= 10
     *
     * 1 <= |A| <= 105
     *
     * 1 <= A[i] <= 109
     *
     *
     *
     * Input Format
     *
     * First line of the input contains a single integer T.
     *
     * For each test case:
     *
     * First line consists of a single integer |A| denoting the length of array.
     * Second line consists of |A| space separated integers denoting the elements of array A.
     *
     *
     * Output Format
     *
     * For each test case:
     *
     * First line should contain an array of space separated integers containing all the odd elements of array A
     * Second line should contain an array of space separated integers containing all the even elements of array A
     *
     *
     * Example Input
     *
     * Input 1:
     *
     *  2
     *  5
     *  1 2 3 4 5
     *  3
     *  4 3 2
     * Input 2:
     *
     *  2
     *  3
     *  2 2 2
     *  2
     *  1 1
     *
     *
     * Example Output
     *
     * Output 1:
     *
     *  1 3 5
     *  2 4
     *  3
     *  4 2
     * Output 2:
     *
     *  2 2 2
     *  1 1
     *
     *
     * Example Explanation
     *
     * Explanation 1:
     *
     *  Test Case 1:
     *  Odd elements in the array(in the order they occur) are: 1, 3, 5.
     *  Even elements in the array(in the order they occur) are: 2, 4.
     *
     *  Test Case 2
     *  Odd elements in the array(in the order they occur) are: 3.
     *  Even elements in the array(in the order they occur) are: 4, 2.
     * Explanation 2:
     *
     *  Test Case 1:
     *  There are no odd elements in the array.
     *  Even elements in the array(in the order they occur) are: 2, 2, 2.
     *
     *  Test Case 2
     *  Odd elements in the array(in the order they occur) are: 1, 1.
     *  There are no even elements in the array.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        //[1,T]
        int N;
        String[]inputs;
        int[]A;
        for(int testCount=1;testCount<=T;testCount++)
        {
            N=Integer.parseInt(br.readLine());
            inputs=br.readLine().split(" ");
            A=new int[N];
            for(int i=0;i<=N-1;i++)
            {
                A[i]=Integer.parseInt(inputs[i]);
            }

            //print all odd separated by space-NO space at the end
            for(int i=0;i<=N-1;i++)
            {
                if(A[i]%2!=0 && i!=N-1)
                {
                    System.out.print(A[i]+" ");
                }
                else if(A[i]%2!=0 && i==N-1)
                {
                    System.out.print(A[i]);
                }
            }//print odd

            //new line after System.out.print
            System.out.println();

            //print all even separated by space, no space at the end
            //put new line after this-since, next line of input must come on new line
            //i.e. for next testcase
            for(int i=0;i<=N-1;i++)
            {
                if(A[i]%2==0 && i!=N-1)
                {
                    System.out.print(A[i]+" ");
                }
                else if(A[i]%2==0 && i==N-1)//no space at the end
                {
                    System.out.print(A[i]);
                }
            }//print even
            System.out.println();//if this is not put, input for next testcase, will come on same line
        }//testcases
    }//
}
