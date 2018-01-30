interface A
{
	int a=10;
	void show();
}
abstract class Main implements A
{
	public static void main(String arg[])
	{
		System.out.println(a);
	}
}