public class reverse {
    public static void main(String[] args) {
        int num=123;
        int newNum=0;
        while(num>0)
        {
            int rem=num%10;
            //int newNum=0;
            newNum=newNum*10+rem;
            num=num/10;
        }
        System.out.println(newNum);
    }
}
