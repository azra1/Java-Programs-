class Ca
{
	int C()
	{
		try
		{
			System.out.println("I am Return 20");
			return(20);
		}
		catch(Exception E)
		{
		}
		finally
		{
			System.out.println("I am Return 200");
			return(200);
		}
	}
	public static void main(String arg[])
	{
		Ca ob= new Ca();
		int x= ob.C();
		System.out.println(x);
	}
}