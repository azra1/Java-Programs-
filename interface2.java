interface A
{
	void show();
}
class M implements A
{
	void disp()
	{
		System.out.println("Display");
	}
	public void show()
	{
		System.out.println("Show");
	}
}
class Main
{
	public static void main(String arg[])
	{
		A obj=new M();
		obj.show();
		//obj.disp();
		M obj1=(M) obj;
		obj1.disp();
		obj1.show();
		M obj2=new M();
		obj2.show();
		obj2.disp();
	}
}