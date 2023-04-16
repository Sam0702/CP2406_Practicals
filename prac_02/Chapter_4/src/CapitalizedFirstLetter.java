import java.util.Scanner;

public class CapitalizedFirstLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        System.out.println("Enter a line of text");
        line = scanner.nextLine();
        System.out.println();
        System.out.println("Capitalized Version");
        printCapitalized(line);
    }

    static void printCapitalized(String str){
        char ch;
        char prevCh;
        int i;
        prevCh = '.';
        for (i = 0; i < str.length(); i++){
            ch = str.charAt(i);
            if (Character.isLetter(ch) && ! Character.isLetter(prevCh))
                System.out.print(Character.toUpperCase(ch));
            else
                System.out.print(ch);
            prevCh = ch;
        }
        System.out.println();
    }
}
