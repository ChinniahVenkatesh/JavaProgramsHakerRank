import java.util.Scanner;

public class desitination {


    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        String place = sc.nextLine();
        desitination ds = new desitination();
        int price = ds.desitinationPrice(place);
        System.out.println(price);

    }

    public int desitinationPrice(String place)
    {
        int price = 0;
        if(place.equalsIgnoreCase("Devakottai"))
        {
            price = 450;
        }
        else if(place.equalsIgnoreCase("Tirchy"))
        {
            price = 350;
        }
        return price;
    }
    
}
