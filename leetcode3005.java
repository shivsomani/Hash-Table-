https://leetcode.com/problems/count-elements-with-maximum-frequency/

public class leetcode3005 
{
    public static void main(String[] args) 
    {
        public int maxFrequencyElements(int[] nums) 
        {
            Hashtable<Integer, Integer> map= new Hashtable<>();
            for(int key:nums)
            {
                map.put(key,map.getOrDefault(key,0)+1);
            }

            int freq=0;
            for(int i:map.values())
            {
                freq=Math.max(i,freq);
            }

            int result=0;
            for(int count: map.values())
            {
                if(count==freq)
                    result=result+count;
            }
            return result;
        }
    }
}

