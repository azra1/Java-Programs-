class Hello
{
	protected Hello()
	{
		
		System.out.println("Non Parameterized");
		
	}
	protected Hello(int a)
	{
		
		System.out.println("Paramerterized");
	
		System.out.println(a);
	}
	protected Hello(long b)
	{	
		System.out.println("Multi Argument Constructor");
	}
public static void main(String args[])
	{	
	Hello ab = new Hello(7);
	Hello a= new Hello(9l);
	}
}
		