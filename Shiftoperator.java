class Shift
{
	public static void main(String arg[])
	{
		int a, b, c, d;
		a=Integer.parseInt(arg[0]);
		b=Integer.parseInt(arg[1]);
		c=a<<b;
		d=a>>b;
		System.out.println("The Right shifting ans is: "+d);
		System.out.println("The Left shifting ans is: "+c);
	}
}