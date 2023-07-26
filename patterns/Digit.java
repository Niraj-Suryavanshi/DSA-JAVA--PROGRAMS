import java.util.*;

class Digit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int count = 0;

        try {
            do {

                String identity_no = sc.nextLine();
                String name = sc.nextLine();
                String valid = sc.nextLine();
                count++;

                if (valid == "no") {
                    break;
                } else {
                    continue;
                }

            } while (true);
        } catch (NoSuchElementException e) {
            System.out.println(count);
        }

    }

}