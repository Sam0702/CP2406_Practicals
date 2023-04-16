import java.util.Scanner;

public class WordList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line;
        int i;
        boolean didCR;
        char ch;

        System.out.println("Enter a line of text");
        line = scanner.nextLine();

        System.out.println();
        didCR = true;

        for (i = 0; i< line.length(); i++){
            ch = line.charAt(i);
            if (Character.isLetter(ch)){
                System.out.print(ch);
                didCR = false;
            }
            else {
                if (didCR == false){
                    System.out.println();
                    didCR = true;
                }
            }
        }
        System.out.println();
    }
}
