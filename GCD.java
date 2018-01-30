import java.util.*;
class GCD
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the First Number ");
		n1=sc.nextInt();
		System.out.println("Enter the Second Number ");
		n2=sc.nextInt();
		while(n1!=n2)
			{
				if(n1>n2)
				n1=n1-n2;
				else
				if(n2>n1)
				n2=n2-n1;
			}
		System.out.println("The GCD of Two Number is "+n1);
	}
}