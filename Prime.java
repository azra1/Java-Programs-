import java.util.*;
class Prime
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int a,flag=0;
		System.out.print("Check whether number is prime or not ");
		a=sc.nextInt();
		for(int i=2; i<=a/2; i++)
		{
			if(a%i==0)
                        
			flag=1;
		}
		if(flag==0)
		System.out.println("Given no is prime no");
		else
		System.out.println("Given no is not prime no");
	}
}