class A
{
	public static void main(String arg[])
{
 		try
		{	int y[]=new int[arg.length];
			System.out.println("Y="+y[1]);
			y[10]=20;
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			if (e instanceof ArithmeticException)
			System.out.println("I am a arithmetic exception");
			if (e instanceof ArrayIndexOutOfBoundsException)
			System.out.println("I am Array Out Of Bound Exception");
		}
		System.out.println("Your array is run");
}
}