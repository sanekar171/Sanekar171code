package day2.random;

import java.util.Arrays;

public class RightRotateInPlace {
    public static void main(String[] args) {
        int[]A={1,2,3,4,5};
        System.out.println("rightRotateInPlace");
        rightRotateInPlace(A,5);
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rightRotateInPlace(A,10);
        System.out.println("***********************");
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rightRotateInPlace(A,1);
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rightRotateInPlace(A,6);
        System.out.println("************************");
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rightRotateInPlace(A,2);
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rightRotateInPlace(A,7);
        System.out.println("************************");
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rightRotateInPlace(A,3);
        //before array goes wrong if this is not put
        A=new int[]{1,2,3,4,5};
        rightRotateInPlace(A,8);
        System.out.println("************************");
    }

    static void rightRotateInPlace(int[]A,int K)
    {
        System.out.println("BEFORE_RIGHT=="+Arrays.toString(A));
        int N=A.length;
        K=K%N;
        int temp;
        /*A=reverse(A,0,N-K-1);*/

        //reverse [0,N-K-1]
        for(int i=0,j=N-K-1; i<j ;i++,j--)
        {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }

        //reverse [N-K,N-1]
        for(int i=N-K,j=N-1; i<j; i++,j--)
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
        System.out.println("AFTER_RIGHT=="+Arrays.toString(A));
    }

    /*private static int[] reverse(int[]A,int start,int end)
    {
        int temp;
        for(int i=start,j=end; i<j; i++,j--)
        {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
        return A;
    }//*/
}
