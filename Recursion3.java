import java.util.*;
class Recursion3
{
	static int digsum(int dig)
	{
		if(dig==0)
		return 0;
		return((digsum(dig/10))+(dig%10));
	}
	public static void main(String arg[])
	{
		System.out.println("Enter the no:");
		Scanner sc=new Scanner(System.in);
		int dig=sc.nextInt();
		int sum;
		sum=digsum(dig);
		System.out.println("The sum of digits is: "+sum);
	}
}
		