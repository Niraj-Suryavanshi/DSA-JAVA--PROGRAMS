
// import java.security.Key;
import java.util.*;

public class HasmapOp {

    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert o(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Bhutan", 1);

        System.out.println(hm);

        // size
        System.out.println(hm.size());

        int population = hm.get("India");
        System.out.println(population);

        hm.clear();
        System.out.println(hm.isEmpty());
    }
}