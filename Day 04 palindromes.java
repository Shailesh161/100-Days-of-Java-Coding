import java.util.Scanner;


public class palindromes
{
    public static void main(String[] args) 
    {
        System.out.println("Enter any number to check palindrome:");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("Your Entered number is :"+num);
        int reversed=0;
        int temp=num;

        while(temp!=0)
        {
            int digit=temp%10;
            reversed=reversed*10+digit;
            temp=temp/10;
        }
        System.out.println("Reversed number is :"+reversed);


        if(num==reversed)
        {
            System.out.println("The given number is palindrome number.");
        }
        else
        {
            System.out.println("Given number is not a palindrome.");
        }
        

    }
}
