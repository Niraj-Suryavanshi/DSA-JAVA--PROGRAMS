import java.util.HashSet;

public class CountDistinct {
    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 1, 2, 3, 4, 5, 6, 6 };
        HashSet<Integer> hs = new HashSet<>();

        for (int a : num) {
            hs.add(a);
        }

        System.out.println("Distinct elements are : " + hs.size());
    }
}
