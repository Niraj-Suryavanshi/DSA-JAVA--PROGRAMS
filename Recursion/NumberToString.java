public class NumberToString {

    static String digits[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void main(String[] args) {
        printDigits(7894);
    }

    public static void printDigits(int number) {

        if (number == 0) {
            return;
        }

        int lastDigits = number % 10;
        printDigits(number / 10);
        System.out.print(digits[lastDigits] + " ");

    }

}
