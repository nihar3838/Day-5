import java.util.Scanner;
public class Harmonicnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Harmonic Value N: ");

        int N = scanner.nextInt();

        if (N == 0) {
            System.out.println("N should not be equal to 0.");
            return;
        }

        double harmonic = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println("The " + N + "th Harmonic Value: " + harmonic);

        scanner.close();
    }
}
