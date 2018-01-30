class One
{
	void hello()
	{
		
		System.out.println("This is base class and this is hello function.");
	}
}
class Two extends One
{
	void hello()
	{
		super.hello();
		System.out.println("This is inherited class and this is hi function.");
	}
}
class M
{
	public static void main(String arg[])
	{

		Two obj= new Two();
		obj.hello();
		//obj.hello();
	}
}