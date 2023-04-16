import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hex;
        long dec;
        int i;
        System.out.print("Enter a hexadecimal number: ");

        hex = scanner.nextLine();
        dec = 0;

        for (i = 0; i < hex.length(); i++) {
            int digit = hexValue(hex.charAt(i));
            if (digit == -1) {
                System.out.println("Error: Input is not a hexadecimal number");
                return;
            }
            dec = 16 * dec + digit;
        }
        System.out.println("Base-10 value: " + dec);
    }

    public static int hexValue(char ch){
        switch (ch){
            case '0' -> { return 0; }
            case '1' -> { return 1; }
            case '2' -> { return 2; }
            case '3' -> { return 3; }
            case '4' -> { return 4; }
            case '5' -> { return 5; }
            case '6' -> { return 6; }
            case '7' -> { return 7; }
            case '8' -> { return 8; }
            case '9' -> { return 9; }
            case 'A', 'a' -> { return 10; }
            case 'B', 'b' -> { return 11; }
            case 'C', 'c' -> { return 12; }
            case 'D', 'd' -> { return 13; }
            case 'E', 'e' -> { return 14; }
            case 'F', 'f' -> { return 15; }
            default  -> { return -1; }
        }
    }
}
