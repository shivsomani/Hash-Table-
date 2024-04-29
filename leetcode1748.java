//https://leetcode.com/problems/sum-of-unique-elements/

import java.util.Hashtable;
import java.util.Set;

public class leetcode1748 {
    public static void main(String[] args) {
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

        int sum=0;
        Set<Integer> setOfKeys=hash1.keySet();
        for(int x:setOfKeys)
        {
            if(hash1.get(x)==1)
            {
                sum=sum+x;
            }
        }
        return sum;
    }
}
