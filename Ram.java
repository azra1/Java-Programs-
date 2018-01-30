class Ram
{
	static void func1()
	{
		System.out.println("I am in Ram class");
	}
	class Shyam
	{
		void func2()
		{
			System.out.println("I am in Shyam class");
		}
	}
}
class Mmethod
{
	public static void main(String arg[])
	{

		Ram r=new Ram();
		Ram.Shyam s=r.new Shyam();
		r.func1();
		s.func2();
	}
}	