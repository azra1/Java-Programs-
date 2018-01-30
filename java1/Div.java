import java.util.*;
class Div
{
	public static void main(String arg[])
	{
	
	try
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the first number: ");
	int a= sc.nextInt();
	System.out.println("Enter the second number: ");
	int b= sc.nextInt();
	int c =a/b;
	System.out.println("ANS = "+c);
		/*if(b==0)
		{
			throw new ArithmeticException();
		}*/
	}
	/*catch(Exception e)
	{
		System.out.println(e.getMessage());
		System.out.println(e);
	}*/
	finally
	{
	}
	
	}
}