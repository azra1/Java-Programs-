class Garbage
{
	public void finalize()
	{
		System.out.println("Objects deleted");
	}
	public static void main(String arg[])
	{
		A obj1=new A();
		A obj2=new A();
		obj2=obj1;
		new A();
		new A();
		new A();
		obj1=null;
		System.gc();
	}
}
