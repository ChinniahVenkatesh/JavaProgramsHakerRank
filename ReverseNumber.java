public class ReverseNumber {

    public static void main(String [] args)
    {
        int a = 1456;
        int r,rev=0;
        while(a > 0)
        {
            r = a % 10; //54
            rev = (rev * 10)+r;//54
            a = a / 10;//14
        }
System.out.println(rev);
    } 
}
