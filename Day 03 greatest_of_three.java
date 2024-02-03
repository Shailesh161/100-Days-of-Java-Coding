public class greatest_of_three
{
  public static void main (String[]args)
  {

    int num1 = 10, num2 = 20, num3 = 30;

    //checking if num1 is greatest
    if (num1 >= num2 && num1 >= num3)
        System.out.println (num1 + " is the greatest");

    //checking if num2 is greatest
    else if (num2 >= num1 && num2 >= num3)
        System.out.println (num2 + " is the greatest");

    //checking if num2 is greatest
    else if (num3 >= num1 && num3 >= num2)
        System.out.println (num3 + " is the greatest");
  }
}
