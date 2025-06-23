package random;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[]A={9,8,7,6,5,4,3,2,1};
        //uncomment ONLY 1 method at a time
        //onePointerInPlace(A);
        //twoPointersInPlace(A);
        onePointerTempArray(A);
        twoPointersTempArray(A);
    }

    static void onePointerInPlace(final int[]A)
    {
        System.out.println(Arrays.toString(A));
        int N=A.length;
        int temp;
        for(int i=0;i<=N/2;i++)
        {
            temp=A[i];
            A[i]=A[N-1-i];
            A[N-1-i]=temp;
        }
        System.out.println(Arrays.toString(A));
    }//

    static void twoPointersInPlace(final int[]A)
    {
        System.out.println(Arrays.toString(A));
        int N=A.length;
        int temp;
        for(int i=0,j=N-1; i<j ;i++,j--)
        {
            temp=A[i];
            A[i]=A[j];
            A[j]=temp;
        }
        System.out.println(Arrays.toString(A));
    }//

    static void onePointerTempArray(final int[]A)
    {
       int N=A.length;
       System.out.println(Arrays.toString(A));
       int[]T=new int[N];
       for(int i=0;i<=N-1;i++)
       {
           T[i]=A[N-1-i];
       }
        System.out.println(Arrays.toString(T));
    }//

    static void twoPointersTempArray(final int[]A)
    {
        System.out.println(Arrays.toString(A));
        int N=A.length;
        int[]T=new int[N];

        for(int i=0,j=N-1; i<=N-1 && j>=0 ; i++,j--)
        {
            T[i]=A[j];
        }
        System.out.println(Arrays.toString(T));
    }//
}
