import java.util.Scanner;

public class switchoperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user inputs
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose operation: +, -, *, /, %");
        char operation = scanner.next().charAt(0); // Read operation symbol

        double result = 0;
        boolean validOperation = true;

        // Switch case for arithmetic operations
        switch (operation) {
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
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            case '%':
                if (num2 != 0)
                    result = num1 % num2;
                else {
                    System.out.println("Error: Modulus by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation! Please enter +, -, *, /, or %.");
                validOperation = false;
        }

        // Display result if the operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}
