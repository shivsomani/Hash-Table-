import java.util.*;

public class leetcode2442 {
    public static void main(String[] args) 
    {
        int[] reverse=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            reverse[i]=reverse(nums[i]);
        }

        Set<Integer> s=new HashSet<>();
        for(int key:nums)
        {
            s.add(key);
        }
        for(int key:reverse)
        {
            s.add(key);
        }
        return s.size();
    }
    public static int reverse(int num)
    {
        int newNum=0;
        while(num>0)
        {
            int rem=num%10;
            newNum=newNum*10+rem;
            num=num/10;
        }
        return newNum;
    }
}
    

