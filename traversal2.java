import java.util.*;

public class traversal2 {
    public static void main(String[] args) {
        Hashtable<String,String> hash1=new Hashtable<String, String>();

        hash1.put("India","delhi");
        hash1.put("USA","washingtonDC");
        hash1.put("England","London");

        Set<String> soc=hash1.keySet();
        /* 
        for(String key:soc)
        {
            System.out.println(key);

            Output: USA
                    England
                    India
        }*/

        //Displaying the output using the for each loop method.
        for(String key:soc)
        {
            System.out.print("Country :" + key + "\t" );     //+ "\t\t" + "Capital :" +hash1.get(key));
            System.out.print("Capital :" + hash1.get(key));
            System.out.println();
        }
    }
}
