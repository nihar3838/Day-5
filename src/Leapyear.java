import java.util.Scanner;
public class Leapyear {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a 4-digit year: ");
        int year = scanner.nextInt();

        if (year >= 1000 && year <= 9999) {
            if (isLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } else {
            System.out.println("Please enter a valid 4-digit year.");
        }

        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}




