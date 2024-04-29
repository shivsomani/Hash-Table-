//Find the repetative element in the array using hash table.
import java.util.Hashtable;
import java.util.*;

public class file1 {
    public static void main(String[] args) {
        int[] num= new int[] {1,2,2,3,4,5};

        //We define a new hash table to store the data.
        Hashtable<Integer,Integer> hash1=new Hashtable<>();
        for(int key:num)
        {
            int count=0;
            if(!hash1.containsKey(key))
            {
                hash1.put(key, ++count);
            }
            else if(hash1.containsKey(key))
            {
                int value1=hash1.get(key);
                value1=value1+1;
                hash1.put(key,value1);
            }
        }

        //hash1.values() gives us the list/set/array of all the values in the hash table.
        System.out.println(hash1.values());
        //System.out.println(hash1);
        //System.out.println(hash1.entrySet());

        Set<Integer> setOfKeys=hash1.keySet();
        for(int x:setOfKeys)
        {
            if(hash1.get(x)==2)
            {
                System.out.println("The repeated element is :" + x);
            }
        }
    }
}
