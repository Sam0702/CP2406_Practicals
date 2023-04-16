import java.util.Scanner;

public class FirstnameLastname {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input;
        int space;
        String firstName;
        String lastName;

        System.out.println();
        System.out.print("Please enter your first name and last name, separated by a space");
        System.out.print("?: ");
        input = scanner.nextLine();

        space = input.indexOf(" ");
        firstName = input.substring(0, space);
        lastName = input.substring(space + 1);

        System.out.println("Your First Name is " + firstName + ", which has " + firstName.length() + " characters");
        System.out.println("Your Last Name is " + lastName + ", which has " + lastName.length() + " characters");
        System.out.println("Your initials are " + firstName.charAt(0) + lastName.charAt(0));

    }
}
