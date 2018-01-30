class Exception2
{
	public static void main(String arg[])
	{
		int j=3;
		try{
			int data[]={10,20,30,40};
			for(int i=0; i<=data.length; i++)
			{
				System.out.println(data[i]/j);
				j--;
			}
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Sorry!! Divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException ao)
		{
			System.out.println("Sorry!! Out of Bound");
		}
		finally{
			System.out.println("WELCOME");
		}
	}
}