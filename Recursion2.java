import java.util.*;
class Recursion2
{
	static int sumlarge(int n)
	{
		
			
		 if(n==0)
			return(0);
		
			return((sumlarge(n-1)+n));
	}
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of terms: ");
		int n=sc.nextInt();
		int sum=0;
		sum=sumlarge(n);
		System.out.println("The sum is: "+sum);
	}
}