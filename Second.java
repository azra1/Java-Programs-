class First
{	
	First()
	{
		System.out.println("M a constructor");
	}

	void Hello()
	{	
		System.out.println("Rawat is Harami!!");
	}
}
class Second extends First
{
	Second()
	{	
		System.out.println("M a Constructor x 2");
	}
	void Hello()
	{ 	super.Hello();
		System.out.println("Yo");
	}
public static void main(String arg[])
	{	
	Second a;
	a=new Second();
	a.Hello();
	}
} 