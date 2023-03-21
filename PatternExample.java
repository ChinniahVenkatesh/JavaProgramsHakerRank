public class PatternExample {

    public static void main(String [] args)
    {
        int n = 20;
        for(int i = 0 ; i < n/2  ; i++)
        {
            for(int j = 0 ; j <=i ; j++)
            {
                System.out.print("1");
            }
            System.out.println("");
        }
        for(int i = n/2 ; i <= n ; i++)
        {
            for(int j = n - i; j >=0 ;j--)
            {
                System.out.print("1");
            }
            System.out.println("");
        }
        
    } 
}



