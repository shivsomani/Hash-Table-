//Program showing the use of getOrDefault() method.

import java.util.HashMap;
import java.util.Hashtable;

public class file3 {
    public static void main(String[] args) 
    {
        Hashtable<Integer,Integer> map=new Hashtable<>();
        Hashtable<Integer,String> map2=new Hashtable<>();

        map2.put(1,"Shivam");
        map2.put(2,"Shiva");
        map2.put(3,"Shiv");
        map2.put(4,"Shivani");

        //The arguments we pass to getOrDefault depends on the definition of the Hash table.
        System.out.println(map2.getOrDefault(2, "null"));
        System.out.println(map2.getOrDefault(5, "null"));

        int[] nums=new int[] {1,2,2,3,4,5};
        for(int key:nums)
        {
            map.put(key,map.getOrDefault(key,0)+1);
            System.out.println("Key: " + key + "\t Value :" +map.get(key));
        }

        /* getOrDefault performs the same function as the below given function/code.
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
         */

        System.out.println(map.entrySet());

        //map.getOrDefault() returns a value associated with the key if the value is present 
        //else returns the default value allocated by us.
        int value1=map.getOrDefault(2, 0);
        System.out.println(value1);
        //returns the value associated with key whose value is 2.

        int value2=map.getOrDefault(10, 0);
        System.out.println(value2);
        //returns the value associated with key whose value is 10.And since there is no value related to it,
        //returns the defaukt value.
    }
}
