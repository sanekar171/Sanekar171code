package random;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapDescendingValues {
    public static void main(String[] args) throws IOException {
        HashMap<Integer,String>hmap=new HashMap<Integer,String>();
        /*hmap.put(1211,"Nagpur");
        hmap.put(560,"Angkor");
        hmap.put(39875,"Bengaluru");
        hmap.put(41,"Bagalkot");
        hmap.put(722,"Bagalkot");
        hmap.put(722,"Kozhikode");*/
        //take hashmap values dynamically tab separated
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        System.out.println("You have chosen to supply "+N+" key value pairs separated by tab");
        String[]inputs;
        for(int i=1;i<=N;i++)
        {
            inputs=br.readLine().split("\t");
            hmap.put(Integer.parseInt(inputs[0]),inputs[1].trim().toLowerCase());
        }
        System.out.println("Inputs are="+hmap);

        Set<Map.Entry<Integer,String>>entries=hmap.entrySet();
        List<Map.Entry<Integer,String>>entryVals=entries.stream().collect(Collectors.toList());
        Collections.sort(entryVals,
                new Comparator<Map.Entry<Integer,String>>()
        {
            @Override
            public int compare(Map.Entry<Integer,String>entry1,Map.Entry<Integer,String>entry2)
            {
                return entry2.getValue().compareTo(entry1.getValue());
            }
        }       );

        for(Map.Entry<Integer,String>entry:entryVals)
        {
            System.out.println("KEY::"+entry.getKey()+"VALUE::"+entry.getValue());
        }
    }//
}
