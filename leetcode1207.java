//https://leetcode.com/problems/unique-number-of-occurrences/

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class leetcode1207 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int key:arr)
        {
            map.put(key,map.getOrDefault(key,0)+1);
        }

        Set<Integer> s=new HashSet<>();
        for(int value:map.values())
        {
            s.add(value);
        }
        return map.size()==s.size();
    }
}

/*int[] arr = new int[] {1,2,2,1,3};

        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int key:arr)
        {
            hash.put(key,hash.getOrDefault(key, 0)+1);
        }
        System.out.println(hash.entrySet());
        System.out.println(hash.keySet());
        System.out.println(hash.values());

        //Set stores unique values only.
        //Duplicates are not allowed inside set.
        Set<Integer> s=new HashSet<>();
        for(int value:hash.values())
        {
            s.add(value);
        }

        System.out.println(s); */