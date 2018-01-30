class A
{
	void A1()
	{
		System.out.println("I am class A");
	}
}
class B extends A
{
	void B1()
	{
		System.out.println("I am class B");
	}
}
class C extends B
{
	void C1()
	{
		System.out.println("I am class C");
	}
}
class Main2
{
	public static void main(String arg[])
	{
		C ob= new C();
		ob.A1();
		ob.B1();
		ob.C1();
	}
}
