public class LargestNumber {

    public static void main(String [] args)
    {
        int a [] = {32,34,56,74,23,12};
        int temp;
        for(int i = 0 ; i < a.length; i++)
        {
            for(int j = i + 1; j < a.length; j++)
            {
                if(a[i] > a[j])
                {
                   temp = a[i];
                   a[i] = a[j];
                   a[j] = temp; 
                }
            }
        }

        System.out.println(" ");
        System.out.print(a[a.length - 1]);
    }
    
}
