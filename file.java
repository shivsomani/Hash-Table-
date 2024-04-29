import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class file {
    public static void main(String[] args) {
        Hashtable<Integer,String> hash1=new Hashtable<>();
        //Creates a new empty hash table.

        //put method is used for inserting values into the hash table.
        hash1.put(1,"Shivam");
        hash1.put(2,"Shivani");
        hash1.put(3,"Sakshi");
        hash1.put(4,"Aisha");
        hash1.put(100,"Aish");

        //Displays the value associated with the given key.
        //The get function gives us the value related to a particular key(here, key=1) inside the hash table.
        //System.out.println(hash1.get(1));           //prints "Shivam"

        System.out.println(hash1.contains("Shivam"));       //returns "true"

        //Displays the set of all the keys related to our reference variable for hash table.
        //hash1 is the reference variable for our hash table.
        //System.out.println(hash1.keySet());

        //the contains() function checks if the "value" providede as argument in the function is present in the hash table or not.
        //the contains() function takes value as an argument rather than key(IMP).
        if(hash1.contains("Shivam"))
        {
            //Since the hash table contains the value, the loop is proceded with.
            //Displays the value associated with the given key.
            //The get function gives us the value related to a particular key inside the hash table.
            String x=hash1.get(1);
            //System.out.println(hash1.get(1));
            System.out.println(x);
        }

        //hash1.get(1);
        //Tests if the specified object is a key in this hashtable.
        //containsKey() is a function which takes in the "key" as argument rather than "value".
        //It returns boolean value depending on whether the given key is present in the hashtable or not.
        int key=2;
        if(hash1.containsKey(key))
        {
            //Displays the value associated with the given key.
            //The get function gives us the value related to a particular key inside the hash table.
            String name=hash1.get(key);
            System.out.println(name);
        }
        //Displaying all the elements(key-value pairs) of the hash table in the form of set/array.
        System.out.println(hash1.entrySet());

        //Displays all the keys in our hash table as set or array.
        System.out.println(hash1.keySet());

        /*
        //Displaying all the elements of the hash table individually.
        for(int key : hash1.keySet())
        {
            System.out.println(key +":"+ hash1.get(key));
        }*/

        //Displaying the  values stored into the hashtable.
        //System.out.println(hash1);

        //Returns the size of the hash table.
        //System.out.println(hash1.size());
        //System.out.println(.forEach();

        //System.out.println(hash1.contains("Aisha"));

        //hash1.entrySet().forEach(System.out::println);
        //This function prints all the key-value pairs in our hash table individually.

        /*
        if(hash1.contains("Aisha"))
        {
            System.out.println(hash1.get("Aisha"));
        }*/

        /*
        for(int i=1;i<=hash1.size();i++)
        {
            System.out.println(hash1.get(i));
        }*/
    }
}
