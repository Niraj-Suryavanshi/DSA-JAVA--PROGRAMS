import java.util.*;

class Alpha {
    public static void main(String[] args) {
        int num = 5;

        switch (num) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("Odd");
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                System.out.println("Prime");
                break;
            default:
                System.out.println("Can only describe numbers from 1 to 9");
        }
    }
}