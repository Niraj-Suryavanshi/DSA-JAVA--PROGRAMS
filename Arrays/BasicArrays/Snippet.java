import java.util.Arrays;
import java.util.Scanner;

public class Snippet {

    // public static void calCulate(int arr[], int press)

    // {
    // int temp = arr[press];
    // for (int i = press; i > 0; i--) {
    // arr[i] = arr[i - 1];
    // }
    // arr[0] = temp;
    // }

    public static void main(String[] args) {
        int n;
        int tabPressCount;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        tabPressCount = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println(Arrays.toString(arr));
        // calCulate(arr, tabPressCount);
        // System.out.println(Arrays.toString(arr));
        // System.out.println("Hello");
    }

}
