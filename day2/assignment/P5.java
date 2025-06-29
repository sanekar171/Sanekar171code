package day2.assignment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int T=Integer.parseInt(br.readLine());
        int N;
        String[]inputs;
        int[]A;
        int B;
        Boolean isFound=null;
        L1:for(int testCount=1;testCount<=T;testCount++)
        {
            N=Integer.parseInt(br.readLine());
            inputs=br.readLine().split(" ");
            A=new int[inputs.length];
            isFound=Boolean.FALSE;//per test-case
            L2:for(int i=0;i<=inputs.length-1;i++)
            {
                A[i]=Integer.parseInt(inputs[i]);
            }
            B=Integer.parseInt(br.readLine());
            L3:for(int i=0;i<=A.length-1;i++)
            {
                if(A[i]==B)
                {
                    isFound=Boolean.TRUE;
                    break L3;
                }
            }
            if(isFound)
                System.out.println(1);
            else
                System.out.println(0);
        }//testcases loop
    }//
}
