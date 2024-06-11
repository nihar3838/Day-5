import java.util.Scanner;
public class Flipcoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of times to flip the coin");

        int flips =0;
        if(scanner.hasNextInt()){
            flips = scanner.nextInt();
            if (flips <= 0) {
                System.out.println("The number of flips must be positive integer");
                return;
            }
        } else {
            System.out.println("Invalid input.Please enter a positive integer");
            return;
        }

        int heads = 0;
        int tails = 0;

        for (int i = 0; i < flips; i++) {
            if (Math.random() < 0.5) {
                tails++;
            } else {
                heads++;
            }
        }
        double headPercentage = ((double) heads / flips) * 100;
        double tailPercentage = ((double) tails / flips) * 100;

        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.printf("Percentage of Heads: %.2f%%\n", headPercentage);
        System.out.printf("Percentage of Tails: %.2f%%\n", tailPercentage);
    }
}





