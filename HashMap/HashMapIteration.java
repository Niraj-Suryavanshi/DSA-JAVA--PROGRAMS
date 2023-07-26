import java.util.HashMap;
import java.util.Set;

public class HashMapIteration {

    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",100);
        hm.put("china",150);
        hm.put("Indonesia",45);
        hm.put("Nepal",15);
        hm.put("US",80);

        //iterate
        Set<String>keys=hm.keySet();//to find all the keys of hashmap and stored it in set
        System.out.println(keys);
        for (String k : keys) 
        {
            System.out.println("Key="+k+ "value="+hm.get(k));
        }

        System.out.println(hm.entrySet());

    }
    
}
