import java.util.Hashtable;

public class file2 {
    public static void main(String[] args) {
        int[] num= new int[] {1,2,2,3,4,5};

        //We define a new hash table to store the data.
        Hashtable<Integer,Integer> hash1=new Hashtable<>();
        for(int key:num)
        {
            //int count=0;
            if(!hash1.containsKey(key))
            {
                int value1=hash1.get(key);      //returns null since the default value for non primitives is null.
                System.out.println(value1);
                value1=value1+1;
                hash1.put(key, value1);
            }
            else if(hash1.containsKey(key))
            {
                int value1=hash1.get(key);
                value1=value1+1;
                hash1.put(key,value1);
            }
        }
    }
}
