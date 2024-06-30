import java.util.Scanner;

class swap_without
{
public static void main(String args[])
{
int x, y;
System.out.println("Enter x and y");
Scanner input = new Scanner(System.in);
x = input.nextInt();
y = input.nextInt();
input.close();
x = x + y;
y = x - y;
x = x - y;
System.out.println("After Swapping\nx = "+x+"\ny = "+y);
}
}
