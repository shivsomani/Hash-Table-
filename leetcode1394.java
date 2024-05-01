import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class leetcode1394 {
    public int findLucky(int[] arr) {
        Hashtable<Integer,Integer> hash1=new Hashtable<>();

        for(int key:arr)
        {
            hash1.put(key,hash1.getOrDefault(key,0)+1);
        }

        Set<Integer> s=new HashSet<>();
        s=hash1.keySet();

        for(int num:s)
        {
            if(num==hash1.get(num))
                return num;
        }
        return -1;
    }
}
