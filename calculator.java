class Calc
{
	public static void main(String arg[])
	{
		int a, b;
		a=Integer.parseInt(arg[0]);
		b=Integer.parseInt(arg[1]);
		int c= a+b;
		int d=a*b;
		int e=a-b;
		int f=a/b;
		int g=a%b;
		System.out.println("The addition is: "+c);
		System.out.println("The subtraction is: "+e);
		System.out.println("The multiplication is: "+d);
		System.out.println("The quotient is: "+f);
		System.out.println("The remainder is: "+g);
	}
}