class multiple
{
	public static void main(String arg[])
	{
		int i=1;
		int sum=0;
		for(i=1; i<1000; i++)
		{
			if((i%3==0)||(i%5==0))
			sum=sum+i;
		}
		System.out.println(sum);
	}
}