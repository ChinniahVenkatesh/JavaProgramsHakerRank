import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class duplicateCharacter {

    public static void main(String [] args) {

        String name = "Malayalam";
        String sentance = "He is good in java and he is good in python";
       // duplicateCharacter.chardup(name);
       duplicateCharacter.duplicharmap(name);

        
    }

    public static void chardup(String name)
    {
        HashMap<Character,Integer> hs = new HashMap<Character,Integer>();
        HashSet<Character> as= new HashSet<Character>();
        for(int i = 0 ; i < name.length(); i++)
        {
           
            if(hs.containsKey(name.charAt(i)))
            {
                if(hs.get(name.charAt(i)) >= 1)
                 {
                    hs.put(name.charAt(i), hs.get(name.charAt(i))+1);
                    as.add(name.charAt(i));
                 }
            }
            else
            hs.put(name.charAt(i),1);

            
        }

        System.out.println(hs);
        System.out.println(as);
    }

    public static void duplicharmap(String name)
    {
        ArrayList<Character> al = new ArrayList<Character>();
        char c [] = {'a','e','i','o','u'};
        for(int i = 0; i < name.length(); i++)
        {
            al.add(name.charAt(i));
        }
        al.stream().filter(s -> (s == 'a' || s == 'e' || s == 'i' || s == 'u')).map(s -> s.getNumericValue(s))
        .forEach(s -> System.out.println(s));
    }
    
}
