import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        // Fill your code here
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Type a value between 0 and 20");
            int n = sc.nextInt();

        } while (n < 0 || n > 20);

        System.out.println("The final value is" + (n + 17));
    }
}