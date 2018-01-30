class Poly
{
	void f1(int a)
	{
		System.out.println("This is first function");
		System.out.println(a);
	}
	void f2(String s)
	{

		System.out.println("This is second function");
		System.out.println(s);
	}
	void f3(String s1, String s2)
	{
		System.out.println("This is third function");
		System.out.println(s1);
		System.out.println(s2);
	}
}
class Mains
{
	public static void main(String arg[])
	{
		Poly p= new Poly();
		p.f1(90);
		p.f2("yo");
		p.f3("Rawat", "Stuti");
	}
}