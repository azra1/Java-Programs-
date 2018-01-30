class Over
{
	void f1()
	{
		System.out.println("This is class over");
		System.out.println("Rawat pagal hai");
	}
}
class Ride extends Over
{
	void f1()
	{

		super.f1();
		System.out.println("This is class ride");
		System.out.println("Rawat Emanshi stuti");
	}
}
class Mains1
{
	public static void main(String arg[])
	{

		Over o=new Over();
		Ride r=new Ride();
		o.f1();
		r.f1();
	}
}
	