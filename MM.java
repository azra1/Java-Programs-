class X
{
	int i=20;
	void hello()
	{
		System.out.println(i);
	}
}
class Y extends X
{
	int j, k=10;
	void sum()
	{
		j=i+k;
		System.out.println(j);
	}
}
class MM
{
	public static void main(String arg[])
	{
		Y obj= new Y();
		obj.sum();
	}
}