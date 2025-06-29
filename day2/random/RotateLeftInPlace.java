package day2.random;

import java.util.Arrays;

public class RotateLeftInPlace {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};

        System.out.println("RotateLeftInPlace");
        rotateLeftInPlace(A,5);
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rotateLeftInPlace(A,10);
        System.out.println("***********************");
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rotateLeftInPlace(A,1);
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rotateLeftInPlace(A,6);
        System.out.println("************************");
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rotateLeftInPlace(A,2);
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rotateLeftInPlace(A,7);
        System.out.println("************************");
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rotateLeftInPlace(A,3);
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rotateLeftInPlace(A,8);
        System.out.println("************************");

    }

    static void rotateLeftInPlace(final int[]A,int K)
    {
        System.out.println("BEFORE_LEFT="+Arrays.toString(A));
        int N=A.length;
        K=K%N;
        int temp;

        //reverse [0,K-1]
        for(int i=0,j=K-1; i<j ;i++,j--)
        {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }

        //reverse [K,N-1]
        for(int i=K,j=N-1; i<j; i++,j--)
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
        System.out.println("AFTER_LEFT="+Arrays.toString(A));
    }

}
