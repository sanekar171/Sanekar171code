package day3.additional;

import java.util.Arrays;

public class P2 {
    public static void main(String[] args) {
        P2 p2=new P2();
        int[] A = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(p2.solve(A)));
        A = new int[]{5, 1, 10, 1};
        System.out.println(Arrays.toString(p2.solve(A)));
    }

    public int[] solve(int[] A) {
        int N = A.length;
        int product = 1;
        for (int i = 0; i <= N - 1; i++) {
            product *= A[i];
        }
        for (int i = 0; i <= N - 1; i++) {
            A[i] = product / A[i];
        }
        return A;
    }//
}