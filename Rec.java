class Rec
{
	

		static int func(int n)
		{
			if(n==0)
				return 1;
			else
				return(1+func(n-1));
		}
	public static void main(String arg[])
	{
		int n=5;
		int a=func(n);
		System.out.print(a);
	}
}