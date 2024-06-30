
import java.util.Scanner;

class Ranged_Sum
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the first number :");
        Scanner input =new Scanner(System.in);
        int a=input.nextInt();
        System.out.println("Enter the second number :");
        int b= input.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            sum=sum+i;   
        }
        System.out.println("Sum is :"+sum);
        input.close();   
    }
}
