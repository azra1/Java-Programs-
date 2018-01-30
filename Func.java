class Func
{
	public static void main(String arg[])
	{
		String n="Hello _IIHT";
		System.out.println(n.substring(3));
		System.out.println(n.substring(3,6));
		String n1[]=n.split("\\s");
		for(String s: n1)
		System.out.println(s);
	}
}