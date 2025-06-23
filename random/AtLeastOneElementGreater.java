package random;

public class AtLeastOneElementGreater {

    public static void main(String[] args) {
        int[]A={1,2,79,-729,-433,284,1,1,1,1,22,28,79,79,79,22,79,-729,-729,81,-729,50,-729};
        int count1=countLessThanMax1(A);
        int count2=countLessThanOrEqualToMax2(A);
        int count3=sizeMinusCountOfMax1(A);
        int count4=bruteForce(A);

        if(count1==count2 && count1==count3 && count1==count4)
        {
            System.out.println("Correct solution");
        }

    }

    static int countLessThanMax1(final int[]A)
    {
        int N=A.length;
        int max1=Integer.MIN_VALUE;
        int countLessThanMax1=0;
        //find max1
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]>max1)
            {
                max1=A[i];
            }
        }
        //find count less than max1
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]<max1)
            {
                countLessThanMax1++;
            }
        }
        System.out.println(countLessThanMax1);
        return countLessThanMax1;
    }//

    static int countLessThanOrEqualToMax2(final int[]A)
    {
        int N=A.length;
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int countLessThanrEqualToMax2=0;
        //find max1
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]>max1)
            {
                max1=A[i];
            }
        }
        //find max2
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]<max1 && A[i]>max2)
            {
                max2=A[i];
            }
        }
        //find count <=max2
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]<=max2)
            {
                countLessThanrEqualToMax2++;
            }
        }
        System.out.println(countLessThanrEqualToMax2);
        return countLessThanrEqualToMax2;
    }//

    static int sizeMinusCountOfMax1(final int[]A)
    {
        int N=A.length;
        //find max1
        int max1=Integer.MIN_VALUE;
        int occurrencesOfMax1=0;
        int result;
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]>max1)
            {
                max1=A[i];
            }
        }
        //count occurrences of max1
        for(int i=0;i<=N-1;i++)
        {
            if(A[i]==max1)
            {
                occurrencesOfMax1++;
            }
        }
        result=N-occurrencesOfMax1;
        System.out.println(result);
        return result;
    }//

    static int bruteForce(final int[]A)
    {
        int N=A.length;
        Boolean isAtLeastOneGreaterToLeft=null;
        Boolean isAtLeastOneGreaterToRight=null;
        int countOfAtLeastOneGreater=0;
        //outer loop-loop of indices to be checked
        L1:for(int i=0;i<=N-1;i++)
        {
            //per element set flags
            isAtLeastOneGreaterToLeft=Boolean.FALSE;
            isAtLeastOneGreaterToRight=Boolean.FALSE;

            //search to left
            L2:for(int j=0;j<=i-1;j++)
            {
                if(A[j]>A[i])
                {
                    isAtLeastOneGreaterToLeft=Boolean.TRUE;
                    break L2;
                }
            }
            //if greater not found on left,then only search to right
            if(!isAtLeastOneGreaterToLeft)
            {
                //search right
                for(int j=i+1;j<=N-1;j++)
                {
                    if(A[j]>A[i])
                    {
                        isAtLeastOneGreaterToRight=Boolean.TRUE;
                    }
                }
            }
            //check if greater found either to left of the right
            if(isAtLeastOneGreaterToLeft || isAtLeastOneGreaterToRight)
            {
                countOfAtLeastOneGreater++;
            }
        }
        System.out.println(countOfAtLeastOneGreater);
        return countOfAtLeastOneGreater;
    }//
}
