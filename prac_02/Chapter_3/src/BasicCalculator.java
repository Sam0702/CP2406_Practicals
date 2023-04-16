import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("Enter the first number (Enter 0 to exit): ");
            double num1 = scanner.nextDouble();

            if (num1 == 0){
                scanner.close();
                System.exit(0);
            }

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;

            switch (operator){
                case '+':
                    result = num1 + num2;
                    break;

                case '-':
                    result = num1 - num2;
                    break;

                case '*':
                    result = num1 * num2;
                    break;

                case '/':
                    if (num2 == 0){
                        System.out.println("Division by zero error");
                        continue;
                    } else {
                        result = num1 / num2;
                    }
                    break;

                default:
                    System.out.println("Invalid Operator");
                    continue;
            }
            System.out.println("Result: " + result);
        }
    }
}
