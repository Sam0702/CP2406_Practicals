import java.util.Scanner;

public class CountChange {
    public static void main(String[] args) {

        int quarters;
        int dimes;
        int nickles;
        int pennies;

        Scanner scanner = new Scanner(System.in);
        double dollars;

        System.out.print("Enter the number of quarters: ");
        quarters = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of dimes: ");
        dimes = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of nickles: ");
        nickles = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the number of pennies: ");
        pennies = scanner.nextInt();
        scanner.nextLine();

        dollars = (0.25 * quarters) + (0.10 + dimes) + (0.05 * nickles) + (0.01 * pennies);

        System.out.println();
        System.out.print("The total dollars is $");
        System.out.printf("%1.2f", dollars);
        System.out.println();
    }
}
