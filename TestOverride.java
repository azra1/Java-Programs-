class Bank
{
	static int ROI()
	{
		return 0;
	}
}
class SBI extends Bank
{
	int ROI()
	{
		return 10;
	}
}
class ICI extends Bank
{
	int ROI()
	{
		return 15;
	}
}
class Canara extends Bank
{
	int ROI()
	{
		return 20;
	}
}
class TestOverride
{
	public static void main(String arg[])
	{
		SBI S= new SBI();
		ICI I= new ICI();
		Canara C= new Canara();
		int a=S.ROI();
		int b=I.ROI();
		int c=C.ROI();
		System.out.println("Rate of interest of SBI is: "+a);
		System.out.println("Rate of interest of ICI is: "+b);
		System.out.println("Rate of interest Of Canara is: "+c);
	}
}