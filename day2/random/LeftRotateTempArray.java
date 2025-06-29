package day2.random;

import java.util.Arrays;

public class LeftRotateTempArray {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};

        leftRotateTempArray(A,1);
        leftRotateTempArray(A,2);
        leftRotateTempArray(A,3);
        System.out.println("*******************");
        leftRotateTempArray(A,6);
        leftRotateTempArray(A,7);
        leftRotateTempArray(A,8);
        System.out.println("*******************");
        leftRotateTempArray(A,5);//N
        leftRotateTempArray(A,10);//N
        System.out.println("*******************");

    }

    static void leftRotateTempArray(int[]A,int K)
    {
        int N=A.length;
        K=K%N;
        int[]T=new int[N];
        for(int i=0;i<=N-K-1;i++)
        {
            T[i]=A[i+K];
        }
        for(int i=N-K;i<=N-1;i++)
        {
            T[i]=A[i-(N-K)];
        }
        System.out.println("K="+K+"N="+N+"\t"+Arrays.toString(T));
    }//
}
