import java.util.Scanner;

public class inputOutput {
    
   
    public static void main(String [] args)
    {
        for(int i = 0; i <= 3 ; i++)
        {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        StringBuffer sb = new StringBuffer(name);
        int j = 0;
        while(j < 15)
        {
          int j1 = name.indexOf(" ");
          sb.insert(++j1, " ");
          j++;
        }
        System.out.println(sb);
        
        }
    }
}
