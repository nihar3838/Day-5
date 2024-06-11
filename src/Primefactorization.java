import java.util.Scanner;

public class Primefactorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number to find prime factors: ");
        int N = scanner.nextInt();

        System.out.print("Prime factors of " + N + " are: ");
        primeFactorization(N);

        scanner.close();
    }

    public static void primeFactorization(int N) {

        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N /= 2;
        }

        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N /= i;
            }
        }

        if (N > 2) {
            System.out.print(N);
        }
    }
}
