package random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RemovalOfDuplicates {
    public static void main(String[] args)throws IOException {
        //take an input string from user and remove duplicates
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String input=br.readLine();
        input=input.toUpperCase();
        int N=input.length();
        char[]letters=input.toCharArray();
        String output="";
        //set duplicate chars to space
        for(int i=0;i<=N-1;i++)
        {
            for(int j=i+1;j<=N-1;j++)
            {
                if(letters[i]==letters[j])
                {
                    letters[j]='*';
                }
            }
        }
        //append chars to output
        for(int i=0;i<=N-1;i++)
        {
            if(letters[i]!='*')
            {
                output+=letters[i];
            }
        }
        System.out.println(output);
    }//
}
