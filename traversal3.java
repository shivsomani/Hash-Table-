import java.util.Hashtable;
import java.util.*;

public class traversal3 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hash1=new Hashtable<>();
        hash1.put(1,"Maharashtra");
        hash1.put(2,"New delhi");
        hash1.put(3,"Telangana");
        hash1.put(4,"Tamil Nadu");

        Set<Integer> setOfKeys=hash1.keySet();
        
        System.out.println("Printing the set of keys:" + setOfKeys);
        System.out.println();

        //Iterator is an interface and we create an object for the iterator.
        Iterator<Integer> itr=setOfKeys.iterator();

        while(itr.hasNext())
        {
            int key=itr.next();
            System.out.println("State :"+ key + "\t Name :" + hash1.get(key));
        }
    }
}
