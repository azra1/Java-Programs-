class Hi
{
}
class Hello
{
	public static void main(String arg[])
	{
		Hi ob=null;
		if(ob instanceof Hi)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}