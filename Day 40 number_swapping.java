import java.util.Scanner;

public class number_swapping
{
    public static void main(String args[])
    {
        Scanner input =new Scanner (System.in);
        System.out.println("Enter the first number:");
        int a =input.nextInt();
        System.out.println("Enter the second number:");
        int b= input.nextInt();
        System.out.println("Your enterd numbers are:"+"a="+a+" b="+b);

        int temp;
        temp=a;
        a=b;
        b=temp; 

        System.out.println("After swapping:");
        System.out.println("a="+a+" b="+b);
        input.close();    
    }
    
}
