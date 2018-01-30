class Exception1
{
	public static void main(String arg[])
	{
	try{
		int a=10; 
		int b=0;
		int c=a/b;
		System.out.println(c);
	}
	catch(ArithmeticException ae)
	{
		ae.printStackTrace();
	}
	System.out.println("Welcome");
	}
}