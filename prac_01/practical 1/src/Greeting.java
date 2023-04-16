import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String userName;
        String upperCaseNumber;

        System.out.println("Please enter your name: ");
        userName = scan.nextLine();

        upperCaseNumber = userName.toUpperCase();

        System.out.println("Hello, " + upperCaseNumber + ", nice to meet you!");
    }
}
