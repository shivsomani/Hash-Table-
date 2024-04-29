//Traversing through a hash table using enumeration interface.

import java.util.*;
public class traversal1 
{
   public static void main(String[] args)
   {
         Hashtable<Integer, String> ht = new Hashtable<>();
         ht.put(1, "Apple");
         ht.put(2, "Strawberry");
         ht.put(3, "Berry");
         ht.put(4, "Guava");
         ht.put(5, "Peach");
    
         Enumeration<Integer> e = ht.keys();
         //System.out.println(e);
         //Output: java.util.Hashtable$Enumerator@4617c264
         //Prints some random hash code

         /* 
         while(e.hasMoreElements())
         {
            System.out.print(e.nextElement()+" ");
            //Displays the list of all the keys
            //Output: 5 4 3 2 1 
         }*/
    
         while(e.hasMoreElements()) 
         {
            int key = e.nextElement();
            System.out.println("Rank : " + key + "\t\t Name : " + ht.get(key));

            //System.out.println("Rank : " + e.nextElement() + "\t\t Name : " + ht.get(e.nextElement()));
         }
   }
}
