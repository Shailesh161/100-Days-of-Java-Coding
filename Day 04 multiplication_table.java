import java.util.Scanner;

public class multiplication_table 
{
    public static void main(String[] args) {
        System.out.println("Enter a Number whose table you want :");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        input.close();
        for(int i=1;i<=10;i++)
        {
        
            System.out.println(n*i);
        }
        
    }
}

git 
//