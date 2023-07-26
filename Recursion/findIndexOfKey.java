public class findIndexOfKey {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;

        findIndex(arr, 0, key);
    }

    public static void findIndex(int arr[], int i, int key) {
        if (key == arr[i]) {
            System.out.print(i + " ");
        }

        if (i == arr.length - 1) {
            return;
        }

        findIndex(arr, i + 1, key);

    }
}
