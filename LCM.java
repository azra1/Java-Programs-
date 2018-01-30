import java.util.*;
class LCM
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner(System.in);
		int n1,n2,L;
		System.out.println("Enter the First Number ");
		n1=sc.nextInt();
		System.out.println("Enter the Second Number ");
		n2=sc.nextInt();
		int a=n1;
		int b=n2;
		while(n1!=n2)
			{
				if(n1>n2)
				n1=n1-n2;
				else
				if(n2>n1)
				n2=n2-n1;
			}
		L=(a*b)/n1;
		System.out.println("The LCM of Two Numbers is "+L);


	}
}