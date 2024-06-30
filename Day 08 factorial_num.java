import java.util.Scanner;


public class factorial_num
{
    public static void main(String[] args) {
        System.out.println("----------Program for factors of a given Number.-------------");
        System.out.println("Enter a number:");
        Scanner input =new Scanner(System.in);
        int num=input.nextInt();
        System.out.println("Factors of "+num+" are :");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(i);
            }
        }

    }
}
