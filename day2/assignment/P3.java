package day2.assignment;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P3 {
    public static void main(String ARGUMENT_VALUES[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String inputs[]=br.readLine().split(" ");
        int N=Integer.parseInt(inputs[0]);
        int[]A=new int[N];
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=N-1;i++)
        {
            A[i]=Integer.parseInt(inputs[i+1]);
        }
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]<min)
                min=A[i];
            if(A[i]>max)
                max=A[i];
        }
        System.out.println(max+" "+min/*No space here*/);
    }
}
