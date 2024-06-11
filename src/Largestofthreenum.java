import java.util.Scanner;

public class Largestofthreenum{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();

        int largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
