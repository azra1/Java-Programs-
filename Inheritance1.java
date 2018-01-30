class Hello
{
	int i=10;
	void HI()
	{
		System.out.println("This is hello Class");
	}
}
class Welcome extends Hello
{
	int i=100;
	void Bye()
	{
		System.out.println("This is welcome class");
		System.out.println(super.i);
	}
}
class Main
{
	public static void main(String arg[])
	{
		Welcome ob= new Welcome();
		ob.HI();
		ob.Bye();
	}
}