import java.util.HashMap;

public class duplicateCharacter {

    public static void main(String [] args)
    {
        String name = "chinniah";

        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
      char c [] =  name.toCharArray();
      int count=0;
       
        for(int i = 0 ; i < c.length ; i++)
        {
          if(hm.containsKey(c[i]))
          {
            int n = hm.get(c[i]);
            hm.put(c[i], n + 1);
          }
          else
          hm.put(c[i],count);
        }
        System.out.println(hm);


    }
    
}
