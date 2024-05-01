import java.util.ArrayList;

public class leetcode2553 {
    public static void main(String[] args) {
        int num=100;
        String one=num+"";
        char[] one1=one.toCharArray();

        ArrayList<Character> list1=new ArrayList<>();

        System.out.println(one);
        for(char ch:one1)
        {
            System.out.println(ch);
            list1.add(ch);
        }
        System.out.println(list1);
    }

}
