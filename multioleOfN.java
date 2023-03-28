import java.util.Scanner;

public class multioleOfN {


    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1, mul = 0;
        while(i <= 10)
        {
            mul = n * i;
            System.out.println(n+"*"+i+"="+mul);
            i++;
            
        }

    }
    
}
