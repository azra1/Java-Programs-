class Construct
{
	void Construct()
	{
		System.out.println("HI CONSTRUCTOR ONE");
	}
	Construct(int a, char b)
	{
		System.out.println("HI CONSTRUCTOR TWO");
		System.out.println(a);
		
		System.out.println(b);
	}
	Construct()
	{
		this(10, 'A');
		System.out.println("HI CONSTRUCTOR THREE");
	}
	public static void main(String args[])
	{
		Construct ob=new Construct();
		ob.Construct();
	}
}	