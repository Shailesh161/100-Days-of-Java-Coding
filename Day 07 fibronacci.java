import java.util.Scanner;;

class fibronacci
{
    public static void main(String[] args) 
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number upto which you wanna display fibronacci series:");
        int num=input.nextInt();
        int a =0,b=1;
        
        System.out.print(a+","+b);
        int nextTerm;
        for(int i=2;i<num;i++)
        {
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            System.out.print(","+nextTerm);
        }
        input.close();
    }
}
