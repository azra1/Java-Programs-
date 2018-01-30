class Recursion1
{
	static void abc()
	{
		System.out.println("Recursion");
		abc();
	}
	public static void main(String arg[])
	{
		abc();
	}
}