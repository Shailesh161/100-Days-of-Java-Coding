import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the range between you want to print:");
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int range = input.nextInt();

        for (int i = start; i <= range; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        input.close();
    }

    // Function to check if a number is prime
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
