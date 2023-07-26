
import java.util.HashSet;

public class UnionIntersection {
    public static void main(String[] args) {
        int arr1[] = { 3, 7, 4 };
        int arr2[] = { 1, 3, 4, 5, 6, 9 };
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            hs.add(arr2[i]);
        }

        System.out.println("Union is : " + hs.size());

        System.out.println(hs);

        hs.clear();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        int count = 0;

        HashSet<Integer> hm = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                count++;
                hm.add(arr2[i]);
                hs.remove(arr2[i]);
            }
        }

        System.out.println("Intersection is : " + count);
        System.out.println(hm);

    }
}
