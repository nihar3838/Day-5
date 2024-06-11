import java.util.Scanner;

public class Calcquotientremainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter dividend: ");
        int dividend = scanner.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = scanner.nextInt();

        // Compute quotient and remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Output
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the scanner
        scanner.close();
    }
}
