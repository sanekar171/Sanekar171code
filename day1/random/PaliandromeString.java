package day1.random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PaliandromeString {
    //take string input from user and confirm whether Paliandrome
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        int N=input.length();
        char[]letters=input.toCharArray();
        String revString;
        //in place reversal
        char temp;
        for(int i=0;i<=N/2;i++)
        {
            temp=letters[i];
            letters[i]=letters[N-1-i];
            letters[N-1-i]=temp;
        }
        revString=new String(letters);
        //System.out.println(revString);
        if(input.equalsIgnoreCase(revString))
        {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }//
}
