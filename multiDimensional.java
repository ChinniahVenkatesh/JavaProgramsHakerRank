public class multiDimensional {

    public static void main(String [] args)
    {
        int [][] a = {{1,2},{3,4}};
        int b [] [] = new int [2][2];
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0 ; j < a.length; j++)
            {
             b[i][j] = a[i][j];
            if(b[i][j] == a[i][j])
            {
                int sum = a[i][j] + b[i][j];
                System.out.println(sum);
            }
            }
            //System.out.println();
           // System.out.println(b[1][0]);
        }
    }
}
