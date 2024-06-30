import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args) 
    {
        System.out.println("Enter a number: ");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
    
        int digit=0;
        while(num!=0)
        {
            digit=digit+(num%10);
            num=num/10; 
        }
        System.out.println("Sum is :"+digit);
        input.close();
    
    }
}
