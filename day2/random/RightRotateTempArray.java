package day2.random;

import java.util.Arrays;

public class RightRotateTempArray {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};

        rightRotateTempArray(A,1);
        rightRotateTempArray(A,2);
        rightRotateTempArray(A,3);
        System.out.println("**********************");
        rightRotateTempArray(A,6);
        rightRotateTempArray(A,7);
        rightRotateTempArray(A,8);
        System.out.println("**********************");
        rightRotateTempArray(A,5);//N
        rightRotateTempArray(A,10);//N
    }

    static void rightRotateTempArray(final int[]A,int K)
    {
        int N=A.length;
        K=K%N;

        int[]T=new int[N];

        for(int i=0;i<=K-1;i++)
        {
            T[i]=A[i+(N-K)];
        }
        for(int i=K;i<=N-1;i++)
        {
            T[i]=A[i-K];
        }
        System.out.println("K="+K+"N="+N+"\t"+Arrays.toString(T));
    }//
}
