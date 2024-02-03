import java.util.Scanner;

// public class factorial 
// {
//     public static void main(String args[])
//     {
//         System.out.println("Enter a number whose factorial you want:");
//         Scanner input =new Scanner(System.in);
//         int n=input.nextInt();
//         int fact=n;
//         for(int i=n-1;i>=1;i--)
//         {
//             fact=fact*i;
//         }
//         System.out.println("Factorial of given number is :"+fact);
//     }    
// }



//Method 2 ----Easy Method

public class factorial
{
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial do you want :");
        Scanner input =new Scanner(System.in);
        int n =input.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of given number is :"+fact);
        input.close();
    }
}
