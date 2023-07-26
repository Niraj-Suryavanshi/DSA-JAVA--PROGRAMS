public class Reverse {
    public static void main(String[] args) {
        String str = "Niraj";
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i) + temp;
        }

        System.out.println(temp);

    }
}
