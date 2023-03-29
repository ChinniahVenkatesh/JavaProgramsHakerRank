public class pattern {

    public static void main(String [] args)
    {
        //System.out.println( 4 / 0);
        System.out.println( 0 / 4);
        for(int i = 0 ; i < 5; i++)
        {
            for(int j=0; j < 5; j++)
            {
                if(j ==2 || i==2 || i+j == 0 || i+j == 8 || (i == 4 && j == 0)||(j==4 && i == 0) || (i == 1 && j ==0) || (i==3 && j == 4) || (i == 4 && j == 1) || (i == 0 && j ==3))
                {
                    System.out.print("*"); 
                }
                else if(i+j == 5 || i == 3)
                {
                    System.out.print(" ");  
                }
                else
                {
                    System.out.print(" ");  
                }
                
            }
            System.out.println(" ");
        }
    }
    
}
