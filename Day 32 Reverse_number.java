import java.util.Scanner;

public class Reverse_number 
{
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("You have entered: " + num);
        input.close();
        // Reverse the number
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed number: " + reversed);
    }
}
